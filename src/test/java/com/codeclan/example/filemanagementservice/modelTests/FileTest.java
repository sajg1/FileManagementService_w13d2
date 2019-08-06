package com.codeclan.example.filemanagementservice.modelTests;

import com.codeclan.example.filemanagementservice.models.File;
import com.codeclan.example.filemanagementservice.models.Folder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileTest {

    File file;
    Folder folder;

    @Before
    public void before() {
        folder = new Folder("Careers");
        file = new File("cv", "doc", 10, folder);
    }

    @Test
    public void hasName() {
        assertEquals("cv", file.getName());
    }

    @Test
    public void hasExtension() {
        assertEquals("doc", file.getExtension());
    }

    @Test
    public void hasSize() {
        assertEquals(10, file.getSize());
    }
}
