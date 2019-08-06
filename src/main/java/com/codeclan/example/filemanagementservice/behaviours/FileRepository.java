package com.codeclan.example.filemanagementservice.behaviours;

import com.codeclan.example.filemanagementservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
