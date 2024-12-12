package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("helloWorld")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World");
    }

}
