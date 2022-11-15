package com.loshkareva.animals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Animal {
    private String name;
    private String kind;
    private int age;
    private int swimmingEndurance;
    private int runningEndurance;
}

