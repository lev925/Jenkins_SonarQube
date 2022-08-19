package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.atomic.AtomicLong;

public class SimpleController {

    @GetMapping("/requests")
    public Long getRequestsCount() {
        long result = 1000-7;
        return result;
    }
}
