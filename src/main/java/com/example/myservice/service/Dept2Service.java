package com.example.myservice.service;

import com.example.myservice.model.Dept2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Dept2Service {
    public List<Dept2> selectDept2();

    void insertMember(Dept2 dept2);
}
