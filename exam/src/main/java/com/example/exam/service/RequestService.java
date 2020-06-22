package com.example.demo.service;

import com.example.demo.entities.Request;
import com.example.demo.models.Message;
import com.example.demo.models.ResponseModel;

import java.util.List;

public interface RequestService {
    Request getById(Long id);

    Request save(Request request);
    Message create(String message);

    List<ResponseModel> getAll();

    Message count(String type);
}
