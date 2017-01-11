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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TriangleControllerTest {
    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldAreaTriangle() throws Exception {

        MockHttpServletRequestBuilder request = post("/triangle/area")
                .contentType(MediaType.APPLICATION_JSON)
                .content("[{\"width\":3, \"height\":4},{\"width\":5, \"height\":6}]");

            this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.area", is(closeTo(21, 0.1))));

    }
}