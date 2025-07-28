package com.genie.quiz.controller;

import com.genie.quiz.dto.LoginRequest;
import com.genie.quiz.entity.JavaScriptQue;
import com.genie.quiz.service.JavaScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/javascript")
public class JavaScriptController {

    @Autowired
    JavaScriptService javaScriptService;

    // Hardcoded credentials for now
    private final String USERNAME = "user";
    private final String PASSWORD = "password";

    @PostMapping("/javascript/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        if (USERNAME.equals(loginRequest.getUsername()) && PASSWORD.equals(loginRequest.getPassword())) {
            return "Login Successful!";
        } else {
            return "Invalid username or password";
        }
    }
    @GetMapping("/js_que")
    public List<JavaScriptQue> getQuestions() {
        return  javaScriptService.getAllQuestions();
    }

    @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
    public JavaScriptQue saveQuestion(@RequestBody  JavaScriptQue question) {
        return  javaScriptService.saveQuestion(question);
    }
}
