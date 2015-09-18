package com.by.siarheihopsha.testzoo.entity.animals;

/**
 * Created by Siarhei Hopsha on 18.09.2015.
 */
public class Cow extends Animal {

    private final String speciesCow = "корова";

    public Cow(String color, String food, String name, String method) {
        super(color, food, name, method);
        this.setSpecies(speciesCow);
    }

}
