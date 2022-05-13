package com.example.myservice.service;

import com.example.myservice.dao.EmpDao;
import com.example.myservice.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    EmpDao empDao;

    @Override
    public List<Emp> selectEmp() {
        return empDao.selectEmp();
    }

    @Override
    public void insertMember(Emp emp) {
        empDao.insert(emp);
    }
}
