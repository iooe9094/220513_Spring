package com.example.myservice.service;

import com.example.myservice.model.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpService {
    public List<Emp> selectEmp();

    void insertMember(Emp emp);
}
