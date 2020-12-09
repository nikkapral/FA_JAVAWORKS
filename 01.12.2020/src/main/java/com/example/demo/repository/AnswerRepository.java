package com.example.demo.repository;



import com.example.demo.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends Jpa.repository<Answer, Long> {
    List<Answer> findBy
















}
