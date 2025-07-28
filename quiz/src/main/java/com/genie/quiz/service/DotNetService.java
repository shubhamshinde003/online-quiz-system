package com.genie.quiz.service;

import com.genie.quiz.entity.DotNetQue;
import com.genie.quiz.repo.DotNetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DotNetService {
    @Autowired
    DotNetRepo dotNetRepo;

    public List<DotNetQue> getAllQuestions()
    {
        List<DotNetQue> questionRepoAll =  dotNetRepo.findAll();
        return  questionRepoAll;
    }

    public  DotNetQue saveQuestion( DotNetQue question){
         DotNetQue save =  dotNetRepo.save(question);
        return save;
    }
}
