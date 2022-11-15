package com.loshkareva.animals;

import com.loshkareva.interfaces.IRun;
import com.loshkareva.interfaces.ISwim;

public class Dog extends Animal implements IRun, ISwim {

    public Dog(String name, String kind, int age, int swimmingEndurance, int runningEndurance) {
        super(name, kind, age, swimmingEndurance, runningEndurance);
    }

    @Override
    public String run(int lengthOfObstacle) {
        String result;
        if (lengthOfObstacle >= getRunningEndurance()) {
            result = "Dog can't run so far.";
        } else {
            result = Integer.toString(lengthOfObstacle);
        }
        return result;
    }


    @Override
    public String swim(int lengthOfObstacle) {
        String result;
        if (lengthOfObstacle >= getSwimmingEndurance()) {
            result = "Dog can't swim so far.";
        } else {
            result = Integer.toString(lengthOfObstacle);
        }
        return result;

    }

    @Override
    public String toString() {
        return "\nDog " + "\n" +
               "Name: " + super.getName() + "\n" +
               "Kind: " + super.getKind() + "\n" +
               "Age: " + super.getAge() + "\n" +
               "An endurance for run: " + getRunningEndurance() + "\n" +
               "An endurance for swim: " + getSwimmingEndurance() + "\n";

    }
}
