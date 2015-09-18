package com.by.siarheihopsha.testzoo.entity.animals;

/**
 * Created by Siarhei Hopsha on 18.09.2015.
 */
public class Che extends Animal {

    private final String speciesChe = "неизвестно";
    private final String colorChe = "коричневый";
    private final String foodChe = "ничего";
    private final String nameChe = "Чебурашка";
    private final String methodChe = "не ем";

    public Che() {
        super();
        this.setSpecies(speciesChe);
        this.setColor(colorChe);
        this.setFood(foodChe);
        this.setName(nameChe);
        this.setMethod(methodChe);
    }

    @Override
    public String introduce() {
        return "Привет, мой цвет " + color + ", меня зовут " + name + ", я " + method + " " + food;
    }

}
