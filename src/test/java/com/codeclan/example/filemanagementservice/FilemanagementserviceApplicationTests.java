package com.codeclan.example.filemanagementservice;

import com.codeclan.example.filemanagementservice.behaviours.FileRepository;
import com.codeclan.example.filemanagementservice.models.File;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilemanagementserviceApplicationTests {

	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFile() {
		File file = new File("cv", "doc", 10);
		fileRepository.save(file);
	}

}
