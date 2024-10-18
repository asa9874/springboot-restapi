package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ResponseDTO;
import com.example.dto.itemDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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

    @PostMapping("/item")
    public ResponseDTO registerItem(@RequestBody itemDTO item) {
        ResponseDTO responsedto = new ResponseDTO();
        responsedto.setMessage("OK");
        return responsedto;
    }
    

}
