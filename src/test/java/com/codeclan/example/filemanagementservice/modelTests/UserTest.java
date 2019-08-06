package com.codeclan.example.filemanagementservice.modelTests;

import com.codeclan.example.filemanagementservice.models.File;
import com.codeclan.example.filemanagementservice.models.Folder;
import com.codeclan.example.filemanagementservice.models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    User user;
    Folder folder;
    File file;

    @Before
    public void before() {
        file = new File("cv", "doc", 10);
        folder = new Folder("Careers");
        user = new User("Steve");
    }

    @Test
    public void hasName() {
        assertEquals("Steve", user.getName());
    }

    @Test
    public void listStartsEmpty() {
        assertEquals(0, user.countFolders());
    }

    @Test
    public void addFolderToList() {
        folder.addFile(file);
        user.addFolder(folder);
        assertEquals(1, folder.countFiles());
        assertEquals(1, user.countFolders());
    }
}
