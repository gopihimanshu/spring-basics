package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCalculateDistanceInGraph() throws Exception {
        Graph g1 = new Graph(2,4);
        Graph g2 = new Graph(6,8);

        List<Graph> coordinates = new ArrayList<>();
        coordinates.add(g1);
        coordinates.add(g2);

        double result = Graph.distance(coordinates);
        assertEquals(5.6,result,0.1);

    }

    @Test
    public void shouldCalculateSlopeInGraph() throws Exception {
        Graph g1 = new Graph(4,4);
        Graph g2 = new Graph(9,8);

        List<Graph> coordinates = new ArrayList<>();
        coordinates.add(g1);
        coordinates.add(g2);

        double result = Graph.slope(coordinates);
        assertEquals(0.8,result,0.1);

    }

    @Test
    public void shouldCalculateYInterceptInGraph() throws Exception {
        Graph g1 = new Graph(4,4);
        Graph g2 = new Graph(9,8);

        List<Graph> coordinates = new ArrayList<>();
        coordinates.add(g1);
        coordinates.add(g2);

        double result = Graph.yIntercept(coordinates);
        assertEquals(0.8,result,0.1);

    }

}