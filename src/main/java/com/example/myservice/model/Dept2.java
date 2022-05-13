package com.example.myservice.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dept2 {
    private int dno;
    @JsonProperty(value="dname")
    private String dname;
    @JsonProperty(value="loc")
    private String loc;
}
