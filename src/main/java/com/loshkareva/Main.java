package com.loshkareva;

import com.loshkareva.animals.Cat;
import com.loshkareva.animals.Dog;


public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", "Siamese", 2, 0, 200);

        String string = cat.toString();
        String s2 = cat.run(5);
        String s1 = cat.swim(4);
        System.out.println(string + "The length of the obstacle for swimming: " + s1 +
                           "\nThe length of the obstacle for running: " + s2);


        Dog dog = new Dog("Jessy", "Rottweiler", 6, 10, 500);

        String string1 = dog.toString();
        String s3 = dog.run(300);
        String s = dog.swim(4);
        System.out.println(string1 + "The length of the obstacle for swimming: " + s +
                           "\nThe length of the obstacle for running: " + s3);

        int counter = dog.getCounter();
        System.out.println("\nTotal objects = " + counter);
    }

}
