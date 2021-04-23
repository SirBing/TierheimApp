package com.example.tierheimapplication.Repository;

import com.example.tierheimapplication.animals.Animal;

import java.util.ArrayList;



public interface IRepository {
    void addAnimal(Animal animal);

    Animal getAnimal(int id);

    ArrayList<Animal> getAnimals(String name);

    ArrayList<Animal> getAnimals();

    void removeAnimal(int id);

    void updateAnimal(int id, Animal animal);
}
