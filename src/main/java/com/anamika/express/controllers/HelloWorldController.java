package com.anamika.express.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @RequestMapping("/{id}/{name}/{comment}")
    public String hello(@PathVariable("id") String id,
                        @PathVariable("name") String name,
                        @PathVariable("comment") String comment)
    {
        return id + " " + name + " " + comment;
    }
}