package com.example.myservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Emp {
    private int eno;
    @JsonProperty(value="ename")
    private String ename;
    @JsonProperty(value="job")
    private String job;
    private int manager;
    @JsonProperty(value="hiredate")
    private String hiredate;
    private int salary;
    private int commission;
    private int dno;
}
