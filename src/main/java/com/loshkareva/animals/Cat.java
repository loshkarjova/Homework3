package com.loshkareva.animals;

import com.loshkareva.interfaces.IRun;
import com.loshkareva.interfaces.ISwim;

public class Cat extends Animal implements IRun, ISwim {

    public Cat(String name, String kind, int age, int swimmingEndurance, int runningEndurance) {
        super(name, kind, age, swimmingEndurance, runningEndurance);

    }

    @Override
    public String run(int lengthOfObstacle) {
        String result;
        if (lengthOfObstacle >= getRunningEndurance()) {
            result = "Cat can't run so far.";
        } else {
            result = Integer.toString(lengthOfObstacle);
        }
        return result;

    }


    public String swim(int lengthOfObstacle) {
        return "Cat can't swim.";
    }

    @Override
    public String toString() {
        return "Cat" + "\n" +
               "Name: " + super.getName() + "\n" +
               "Kind: " + super.getKind() + "\n" +
               "Age: " + super.getAge() + "\n" +
               "An endurance for run: " + getRunningEndurance() + "\n" +
               "An endurance for swim: " + getSwimmingEndurance() + "\n";

    }


}
