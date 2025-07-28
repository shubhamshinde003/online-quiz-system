package com.genie.quiz.repo;

import com.genie.quiz.entity.JavaScriptQue;
import com.genie.quiz.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavaScriptRepo   extends JpaRepository<JavaScriptQue,Long> {
}


