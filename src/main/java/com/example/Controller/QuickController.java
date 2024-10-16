package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {
    @GetMapping("/dummy")
    public String dummy(){
        return "{}";
    }

    @GetMapping("/member")
    public String getMember(@RequestParam("empNo") String empNo){
        return "ok";
    }

    @GetMapping("/member2/{empNo}")
    public String getMember2(@PathVariable("empNo") String empNo){
        return "ok";
    }
}
