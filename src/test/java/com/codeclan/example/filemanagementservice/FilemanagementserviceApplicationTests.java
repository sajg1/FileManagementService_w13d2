package com.codeclan.example.filemanagementservice;

import com.codeclan.example.filemanagementservice.behaviours.FileRepository;
import com.codeclan.example.filemanagementservice.behaviours.FolderRepository;
import com.codeclan.example.filemanagementservice.behaviours.UserRepository;
import com.codeclan.example.filemanagementservice.models.File;
import com.codeclan.example.filemanagementservice.models.Folder;
import com.codeclan.example.filemanagementservice.models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilemanagementserviceApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFile() {
		User user = new User("Steve");
		userRepository.save(user);
		Folder folder = new Folder("Careers", user);
		folderRepository.save(folder);
		File file = new File("cv", "doc", 10, folder);
		fileRepository.save(file);
	}

}
