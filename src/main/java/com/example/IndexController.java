package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class IndexController{
    @GetMapping("/index")
    public ResponseEntity index(HttpSession httpSession) {
        httpSession.setAttribute("user", "laixiaoxing");
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/helloword")
    public ResponseEntity hello(HttpSession httpSession) {
        return ResponseEntity.ok(httpSession.getAttribute("user"));
    }
}