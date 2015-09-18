package com.by.siarheihopsha.testzoo.entity.animals;

/**
 * Created by Siarhei Hopsha on 18.09.2015.
 */
public class Wolf extends Animal {

    private final String speciesWolf = "волк";
    private final String colorWolf = "серый";

    public Wolf(String food, String name, String method) {
        super(food, name, method);
        this.setSpecies(speciesWolf);
        this.setColor(colorWolf);
    }

}
