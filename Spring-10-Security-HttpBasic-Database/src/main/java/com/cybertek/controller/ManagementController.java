package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("management")
public class ManagementController {

    @RequestMapping("/index")
    public String index(){
        return "management/index";
    }
}

