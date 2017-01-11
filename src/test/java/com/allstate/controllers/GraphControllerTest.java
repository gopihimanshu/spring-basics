package com.allstate.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class GraphControllerTest {

    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCalculateDistanceInAGraph() throws Exception {
        MockHttpServletRequestBuilder request = post("/graph/distance")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"x\":2, \"y\":4},{\"x\":6, \"y\":8}]");
        System.out.println(request.toString());


        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.distance", is(closeTo(5.6, 0.1))));

    }

}