package com.yotta.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yotta.exam.model.Examination;

@Repository
public interface ExamRepo extends JpaRepository<Examination, Long> {

}
