package com.example.exam.repository;

import com.example.exam.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
    Integer countAllByTypeOfRequest(String type);
}
