package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TriangleTest {

    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldComputeAreaOfAListOfTriangles() throws Exception {
        Triangle t1=new Triangle(3,4);
        Triangle t2=new Triangle(5,6);

        List<Triangle> triangles = new ArrayList<>();
        triangles.add(t1);
        triangles.add(t2);

        double result=Triangle.area(triangles);
        assertEquals(21,result,0.1);

    }

}