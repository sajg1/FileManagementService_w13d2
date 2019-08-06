package com.codeclan.example.filemanagementservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.util.Lazy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @JsonIgnore
    @OneToMany(mappedBy= "folder", fetch = FetchType.LAZY)
    private List<File> files;

    @JsonIgnoreProperties("folders")
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
        this.files = new ArrayList<>();

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public int countFiles() {
        return this.files.size();
    }

    public void addFile(File file) {
        this.files.add(file);
    }
}
