package com.loshkareva.animals;

import com.loshkareva.interfaces.IRun;
import com.loshkareva.interfaces.ISwim;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class Animal implements IRun, ISwim {
    private String name;
    private String kind;
    private int age;
    private int swimmingEndurance;
    private int runningEndurance;
    public static int counter = 0;

    public Animal(String name, String kind, int age, int swimmingEndurance, int runningEndurance) {
        this.name = name;
        this.kind = kind;
        this.age = age;
        this.swimmingEndurance = swimmingEndurance;
        this.runningEndurance = runningEndurance;
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

