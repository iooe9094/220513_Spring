package com.example.myservice.service;

import com.example.myservice.dao.Dept3Dao;
import com.example.myservice.model.Dept3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Dept3ServiceImpl implements Dept3Service{

    @Autowired
    Dept3Dao dept3Dao;

    @Override
    public List<Dept3> selectDept3() {
        return dept3Dao.selectDept3();
    }

    @Override
    public void insertMember(Dept3 dept3) {
        dept3Dao.insert(dept3);
    }
}
