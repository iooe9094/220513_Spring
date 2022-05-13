package com.example.myservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dept3 {
    private int dno;
    @JsonProperty(value="dname")
    private String dname;
    @JsonProperty(value="loc")
    private String loc;
}
