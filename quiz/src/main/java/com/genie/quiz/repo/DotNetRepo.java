package com.genie.quiz.repo;

import com.genie.quiz.entity.DotNetQue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DotNetRepo extends JpaRepository<DotNetQue,Long> {
}

