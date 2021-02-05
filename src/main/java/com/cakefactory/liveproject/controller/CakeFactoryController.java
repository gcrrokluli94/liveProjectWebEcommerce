package com.cakefactory.liveproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CakeFactoryController {
    @GetMapping("/")
    public String getCake(){
        return "cakefactory";
    }
}
