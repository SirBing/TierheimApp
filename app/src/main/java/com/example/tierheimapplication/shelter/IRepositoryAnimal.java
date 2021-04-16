package com.example.tierheimapplication.shelter;

import com.example.tierheimapplication.animals.Animal;

public interface IRepositoryAnimal {

    void addAnimal(Animal animal);

    void removeAnimal(String name);

    Animal editAnimal(String name);
}
