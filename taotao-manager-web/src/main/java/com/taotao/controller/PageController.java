package com.taotao.controller;

import org.apache.jute.Index;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
@RequestMapping("/")
    public String showIndex(){
    return "index";
}
}
