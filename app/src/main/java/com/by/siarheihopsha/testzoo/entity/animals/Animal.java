package com.by.siarheihopsha.testzoo.entity.animals;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Siarhei Hopsha on 18.09.2015.
 */
public abstract class Animal implements Parcelable {

    protected String species;
    protected String color;
    protected String food;
    protected String name;
    protected String method;

    public Animal(String color, String food, String name, String method) {
        this.color = color;
        this.food = food;
        this.name = name;
        this.method = method;
    }

    public Animal(String food, String name, String method) {
        this.food = food;
        this.name = name;
        this.method = method;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public String getMethod() {
        return method;
    }

    public String introduce() {
        return "Привет, я " + species + ", мой цвет " + color + ", меня зовут " + name + ", я " + method + " " + food;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(species);
        dest.writeString(color);
        dest.writeString(food);
        dest.writeString(name);
        dest.writeString(method);
    }

    @Override
    public int describeContents() {
        return 0;
    }

}
