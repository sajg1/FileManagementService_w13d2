package com.codeclan.example.filemanagementservice.components;

import com.codeclan.example.filemanagementservice.behaviours.FileRepository;
import com.codeclan.example.filemanagementservice.behaviours.FolderRepository;
import com.codeclan.example.filemanagementservice.behaviours.UserRepository;
import com.codeclan.example.filemanagementservice.models.File;
import com.codeclan.example.filemanagementservice.models.Folder;
import com.codeclan.example.filemanagementservice.models.User;
//import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;


    public DataLoader() {

    }



    public void run(ApplicationArguments arg) {

        User steve = new User("Steve Gossip");
        userRepository.save(steve);

        Folder career = new Folder("Career", steve);
        folderRepository.save(career);

        Folder codeclan = new Folder("Codeclan", steve);
        folderRepository.save(codeclan);

        File cv = new File("cv", "doc", 10, career);
        fileRepository.save(cv);

        File cv2 = new File("cv2", "txt", 15, career);
        fileRepository.save(cv2);

        File pda = new File ("pda", "pages", 3000, codeclan);
        fileRepository.save(pda);

        File rubyStuff = new File("rubyStuff", "ruby", 20, codeclan);
        fileRepository.save(rubyStuff);

        career.addFile(cv);
        career.addFile(cv2);
        folderRepository.save(career);

        codeclan.addFile(pda);
        codeclan.addFile(rubyStuff);
        folderRepository.save(codeclan);

        steve.addFolder(career);
        steve.addFolder(codeclan);
        userRepository.save(steve);
    }


}
