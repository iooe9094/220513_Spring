package com.example.myservice.service;

import com.example.myservice.dao.Dept2Dao;
import com.example.myservice.model.Dept2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Dept2ServiceImpl implements Dept2Service{

    @Autowired
    Dept2Dao dept2Dao;

    @Override
    public List<Dept2> selectDept2() {
        return dept2Dao.selectDept2();
    }

    @Override
    public void insertMember(Dept2 dept2) {
        dept2Dao.insert(dept2);
    }
}
