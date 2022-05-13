package com.example.myservice.dao;

import com.example.myservice.model.Dept3;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Dept3Dao {
    List<Dept3> selectDept3();

    void insert(Dept3 dept3);
}
