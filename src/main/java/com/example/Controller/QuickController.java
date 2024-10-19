package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.QuickService;
import com.example.dto.ResponseDTO;
import com.example.dto.itemDTO;


@RestController
public class QuickController {

    @Autowired
    private QuickService quickservice;
    
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
        boolean b= quickservice.registerItem(item);
        if(b){
            ResponseDTO responsedto = new ResponseDTO();
            responsedto.setMessage("OK");
            return responsedto;
        }
        else{
            ResponseDTO responsedto = new ResponseDTO();
            responsedto.setMessage("fail");
            return responsedto;
        }

        
    }

    @GetMapping("/item")
    public itemDTO getItem(@RequestParam("id") String id) {
        itemDTO res = quickservice.getItemById(id);
        return res;
    }
    

}
