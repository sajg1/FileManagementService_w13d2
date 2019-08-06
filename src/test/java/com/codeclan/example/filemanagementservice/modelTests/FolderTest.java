package com.codeclan.example.filemanagementservice.modelTests;

import com.codeclan.example.filemanagementservice.models.File;
import com.codeclan.example.filemanagementservice.models.Folder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FolderTest {

    Folder folder;
    File file;

    @Before
    public void before() {
        file = new File("cv", "doc", 10, folder);
        folder = new Folder("Careers");
    }

    @Test
    public void hasTitle() {
        assertEquals("Careers", folder.getTitle());
    }

    @Test
    public void filesListStartsEmpty() {
        assertEquals(0, folder.countFiles());
    }

    @Test
    public void canAddFileToList() {
        folder.addFile(file);
        assertEquals(1, folder.countFiles());
    }

}
