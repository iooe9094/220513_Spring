package com.example.myservice.service;

import com.example.myservice.dao.DeptDao;
import com.example.myservice.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : DeptServiceImpl
 * author : ds
 * date : 2022-05-12
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-12         ds          최초 생성
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    DeptDao deptDao;

//    @Override
//    public List<Dept> selectList() {
//        return null;
//    }

    // select 문을 실행하는 서비스
        @Override
    public List<Dept> selectAll() {
        return deptDao.selectAll();
    }

    @Override
    public void insertMember(Dept dept) {
        // DB에 insert문 실행하는 부분
        deptDao.insert(dept);
    }
}









