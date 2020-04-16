package com.example.securingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller /// means this is an MVC controller - returns "views" (html) not json
public class Example {

    @GetMapping("/test")
    public String getSomeOtherPage(){
        return "test";
    }

}
