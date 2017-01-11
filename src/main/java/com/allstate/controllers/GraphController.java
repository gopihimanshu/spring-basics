package com.allstate.controllers;

import com.allstate.models.Graph;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GraphController {

    @RequestMapping(value ="/graph/distance" , method = RequestMethod.POST)
    public Map<String,Double> distance(@RequestBody List<Graph> graphs){
        double distance= Graph.distance(graphs);
        double slope= Graph.slope(graphs);
        double yintercept= Graph.yIntercept(graphs);
        Map<String,Double> map = new HashMap<>();
        map.put("distance",distance);
        map.put("slope",slope);
        map.put("yintercept",yintercept);
        return map;
    }


}