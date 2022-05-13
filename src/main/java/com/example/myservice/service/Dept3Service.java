package com.example.myservice.service;

import com.example.myservice.model.Dept3;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Dept3Service {
    public List<Dept3> selectDept3();
    void insertMember(Dept3 Dept3);
}
