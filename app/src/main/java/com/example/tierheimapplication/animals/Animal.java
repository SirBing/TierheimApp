package com.example.tierheimapplication.animals;

public class Animal {
    private String name;
    private String gender;
    private String race;
    private int yearOfBirth;


    public Animal(String name, String gender, String race, int yearOfBirth) {
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", gender='" + getGender() + "'" +
            ", race='" + getRace() + "'" +
            ", yearOfBirth='" + getYearOfBirth() + "'" +
            "}";
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getRace() {
        return race;
    }

    public String getGender() {
        return gender;
    }
}
