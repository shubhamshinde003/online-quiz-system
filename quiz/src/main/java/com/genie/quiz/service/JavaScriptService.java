package com.genie.quiz.service;

import com.genie.quiz.entity.JavaScriptQue;
import com.genie.quiz.repo.JavaScriptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JavaScriptService {
    @Autowired
    JavaScriptRepo javaScriptRepo;

    public List<JavaScriptQue> getAllQuestions()
    {
        List< JavaScriptQue> questionRepoAll =  javaScriptRepo.findAll();
        return questionRepoAll;
    }

    public JavaScriptQue saveQuestion(JavaScriptQue question){
         JavaScriptQue save =  javaScriptRepo.save(question);
        return save;
    }
}
