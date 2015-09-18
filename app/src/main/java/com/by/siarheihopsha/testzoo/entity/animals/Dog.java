package com.by.siarheihopsha.testzoo.entity.animals;

/**
 * Created by Siarhei Hopsha on 18.09.2015.
 */
public class Dog extends Animal {

    private final String speciesDog = "собака";

    public Dog(String color, String food, String name, String method) {
        super(color, food, name, method);
        this.setSpecies(speciesDog);
    }

}
