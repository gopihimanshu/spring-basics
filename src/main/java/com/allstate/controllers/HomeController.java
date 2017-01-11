package com.allstate.controllers;

import com.allstate.models.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public Hello home(){
        Hello hello = new Hello("Hello Spring");
        return hello;
    }
}