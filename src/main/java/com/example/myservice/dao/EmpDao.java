package com.example.myservice.dao;

import com.example.myservice.model.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDao {
    List<Emp> selectEmp();

    void insert(Emp emp);
}
