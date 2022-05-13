package com.example.myservice.controller;

import com.example.myservice.dao.Dept2Dao;
import com.example.myservice.dao.Dept3Dao;
import com.example.myservice.dao.DeptDao;
import com.example.myservice.dao.EmpDao;
import com.example.myservice.model.Dept;
import com.example.myservice.model.Dept2;
import com.example.myservice.model.Dept3;
import com.example.myservice.model.Emp;
import com.example.myservice.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName : com.example.myservice.controller
 * fileName : DeptController
 * author : ds
 * date : 2022-05-12
 * description : 메뉴달기 , 반환값 : json파일형태
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-12         ds          최초 생성
 */
// @RestController : 메뉴달기 , 반환값 : json파일형태 ( Vue 연동 )
// @Controller : jsp, html , 타임리프 파일 형태
    // Rest API : CRUD (Insert:POST, Select:Get, Update:Put, Delete:Delete)
@RestController
public class DeptController {

//    @Autowired : 객체를 자동 의존성 주입( 자동 DI )
    // 스프링에 객체를 등록: 클래스 위에 @Component, @Service, @repository
    @Autowired
    DeptDao deptDao;

    @Autowired
    Dept2Dao dept2Dao;

    @Autowired
    Dept3Dao dept3Dao;

    @Autowired
    DeptServiceImpl deptService;

    @Autowired
    Dept2ServiceImpl dept2Service;

    @Autowired
    Dept3ServiceImpl dept3Service;

    @Autowired
    EmpDao empDao;

    @Autowired
    EmpServiceImpl empService;

//    @GetMapping : 메뉴 달기 : /main, select 실행
//    localhost:8000/main 접속 : 새메뉴
    @GetMapping("/dept/all")
    public List<Dept> selectAll() {
        List<Dept> list = deptDao.selectAll();
        return list; // json파일 형태로 보임
    }

    @GetMapping("/dept2/all")
    public List<Dept2> selectDept2() {
        List<Dept2> list = dept2Dao.selectDept2();
        return list;
    }

    // @PostMapping : insert 실행
    // HTML : 헤더(머리말), 본문(BODY)
    // @RequestBody: 본문에 TEXT/ JSON 형태로 데이터를 전송하겠음
    @PostMapping("/dept/new")
    public List<Dept> insertMember(@RequestBody Dept dept) {
        // 웹브라우저에서 json 형태로 데이터를 넘겨 받아 (dept객체)
        // DB에 INSERT 문을 실행하는 부분
        deptService.insertMember(dept);
        // 데이터 추가 되었는지 결과 확인 (DB Select)
        return deptDao.selectAll();
    }

    @PostMapping("/dept2/new")
    public List<Dept2> insertMember(@RequestBody Dept2 dept2) {
        dept2Service.insertMember(dept2);
        return dept2Dao.selectDept2();
    }

    @GetMapping("/dept3/all")
    public List<Dept3> selectDept3() {
        List<Dept3> list = dept3Dao.selectDept3();
        return list;
    }

    @PostMapping("/dept3/new")
    public List<Dept3> insertMember(@RequestBody Dept3 dept3) {
        dept3Service.insertMember(dept3);
        return dept3Dao.selectDept3();
    }

    @GetMapping("/emp/new")
    public List<Emp> selectEmp() {
        List<Emp> list = empDao.selectEmp();
        return list;
    }

    @PostMapping("/emp/new")
    public List<Emp> insertMember(@RequestBody Emp emp) {
        empService.insertMember(emp);
        return empDao.selectEmp();
    }
}











