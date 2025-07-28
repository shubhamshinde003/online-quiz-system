package com.genie.quiz.service;

import com.genie.quiz.entity.PythonQue;
import com.genie.quiz.entity.QuizQuestion;
import com.genie.quiz.repo.PythonQueRepo;
import com.genie.quiz.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PythonService {
    @Autowired
    PythonQueRepo  pythonQueRepo;

    public List<PythonQue> getAllQuestions()
    {
        List<PythonQue> questionRepoAll = pythonQueRepo.findAll();
        return questionRepoAll;
    }

    public PythonQue saveQuestion(PythonQue  question){
        PythonQue   save = pythonQueRepo.save(question);
        return save;
    }
}


