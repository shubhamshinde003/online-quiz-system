package com.genie.quiz.controller;

import com.genie.quiz.dto.LoginRequest;
import com.genie.quiz.entity.PythonQue;
import com.genie.quiz.service.PythonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @CrossOrigin(origins = "http://localhost:8080")
    @RestController
    @RequestMapping("/python")

    public class PythonController {


        @Autowired
        PythonService pythonService;

        // Hardcoded credentials for now
        private final String USERNAME = "user";
        private final String PASSWORD = "password";

        @PostMapping("/login")
        public String login(@RequestBody LoginRequest loginRequest) {
            if (USERNAME.equals(loginRequest.getUsername()) && PASSWORD.equals(loginRequest.getPassword())) {
                return "Login Successful!";
            } else {
                return "Invalid username or password";
            }
        }
        @GetMapping("/python_que")
        public List<PythonQue> getQuestions() {
            return  pythonService.getAllQuestions();
        }

        @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
        public PythonQue saveQuestion(@RequestBody PythonQue question) {
            return  pythonService.saveQuestion(question);
        }

    }


