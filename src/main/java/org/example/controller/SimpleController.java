package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/requests")
    public String getRequestsCount() {
        int result = 1000-7;
        return result+" ";
    }
    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public String test(){
        return "OK";
    }
}
