package com.by.siarheihopsha.testzoo.entity;

import com.by.siarheihopsha.testzoo.entity.animals.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Siarhei Hopsha on 18.09.2015.
 */
public class Zoo {

    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void add(Animal... animals) {
        Collections.addAll(this.animals, animals);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
