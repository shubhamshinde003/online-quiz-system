package com.genie.quiz.controller;

import com.genie.quiz.dto.LoginRequest;
import com.genie.quiz.entity.DotNetQue;
import com.genie.quiz.entity.QuizQuestion;
import com.genie.quiz.service.DotNetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/dotnet")
public class DotNetController {

    @Autowired
    DotNetService dotNetService;

    // Hardcoded credentials for now
    private final String USERNAME = "user";
    private final String PASSWORD = "password";

    @PostMapping("/dotnet/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        if (USERNAME.equals(loginRequest.getUsername()) && PASSWORD.equals(loginRequest.getPassword())) {
            return "Login Successful!";
        } else {
            return "Invalid username or password";
        }
    }
    @GetMapping("/net_que")
    public List<DotNetQue> getQuestions() {
        return  dotNetService.getAllQuestions();
    }

    @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
    public  DotNetQue saveQuestion(@RequestBody DotNetQue question) {
        return  dotNetService.saveQuestion(question);
    }
}
