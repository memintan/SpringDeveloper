package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("profile")
public class ProfileController {

    @RequestMapping("/index")
    public String index(){
        return "profile/index";
    }
}
