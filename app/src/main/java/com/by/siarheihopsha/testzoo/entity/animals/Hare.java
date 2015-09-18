package com.by.siarheihopsha.testzoo.entity.animals;

/**
 * Created by Siarhei Hopsha on 18.09.2015.
 */
public class Hare extends Animal {

    private final String speciesHare = "заяц";
    private final String colorHare = "серый";

    public Hare(String food, String name, String method) {
        super(food, name, method);
        this.setSpecies(speciesHare);
        this.setColor(colorHare);
    }

}
