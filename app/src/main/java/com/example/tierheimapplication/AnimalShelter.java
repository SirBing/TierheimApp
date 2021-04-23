package com.example.tierheimapplication;

import com.example.tierheimapplication.Repository.IRepository;
import com.example.tierheimapplication.Repository.MemoryAnimalRepository;
import com.example.tierheimapplication.animals.Animal;

import java.util.ArrayList;

public class AnimalShelter {

    public static AnimalShelter instance;

    public static AnimalShelter getInstance() {
        if (instance == null) {
            instance = new AnimalShelter(new MemoryAnimalRepository());
        }
        return instance;
    }

    private IRepository repository;

    private AnimalShelter(IRepository repository) {
        this.repository = repository;
    }

    public void addAnimal(Animal animal) {
        repository.addAnimal(animal);
    }

    public void removeAnimal(int id) {
        repository.removeAnimal(id);
    }

    public void print() {
        ArrayList<Animal> animalList = repository.getAnimals();

        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);

            if (animal == null) {
                continue;
            }

            System.out.println("Id: #" + i + ", name: " + animal.getName() + ", gender: " + animal.getGender()
                    + ", year of birth: " + animal.getYearOfBirth());
        }
    }

    public ArrayList<Animal> getList() {
        return repository.getAnimals();
    }
}
