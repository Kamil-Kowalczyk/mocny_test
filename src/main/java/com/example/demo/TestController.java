package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class TestController {

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    // @CrossOrigin 
    //TODO nie działa
    public ResponseEntity<Test> test() {
        Test test = new Test();
        test.name = "kukuryku";
        return ResponseEntity.ok().body(test);
    }
}
