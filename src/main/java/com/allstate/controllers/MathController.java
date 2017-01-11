package com.allstate.controllers;

import com.allstate.models.Hello;
import com.allstate.models.Math;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MathController {
    @RequestMapping(value="/math/square/{x}",method=RequestMethod.GET)
    public Map<String,Integer> square(@PathVariable int x){
        int result = Math.square(x);
        Map<String ,Integer> map=new HashMap<>();
        map.put("square",result);
        return map;
    }
}
