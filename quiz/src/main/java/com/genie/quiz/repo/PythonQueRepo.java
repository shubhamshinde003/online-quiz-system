package com.genie.quiz.repo;

import com.genie.quiz.entity.PythonQue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PythonQueRepo extends JpaRepository<PythonQue,Long> {
}
