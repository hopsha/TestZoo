package com.by.siarheihopsha.testzoo.entity.animals;

/**
 * Created by Siarhei Hopsha on 18.09.2015.
 */
public class Horse extends Animal {

    private final String speciesHorse = "лошадь";

    public Horse(String color, String food, String name, String method) {
        super(color, food, name, method);
        this.setSpecies(speciesHorse);
    }

}
