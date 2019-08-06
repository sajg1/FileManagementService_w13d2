package com.codeclan.example.filemanagementservice.modelTests;

import com.codeclan.example.filemanagementservice.models.File;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileTest {

    File file;

    @Before
    public void before() {
        file = new File("cv", "doc", 10);
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
