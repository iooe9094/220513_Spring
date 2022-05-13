package com.example.myservice.dao;

import com.example.myservice.model.Dept2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Dept2Dao {
    List<Dept2> selectDept2();

    void insert(Dept2 dept2);
}
