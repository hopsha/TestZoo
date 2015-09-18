package com.by.siarheihopsha.testzoo.entity.animals;

/**
 * Created by Siarhei Hopsha on 18.09.2015.
 */
public class Fox extends Animal {

    private final String speciesFox = "лиса";
    private final String colorFox = "рыжий";

    public Fox(String food, String name, String method) {
        super(food, name, method);
        this.setSpecies(speciesFox);
        this.setColor(colorFox);
    }

    @Override
    public String introduce() {
        return "Привет, я " + species + ", мой цвет " + color + ", меня зовут " + name + ", я " + method + " " + food;
    }

}
