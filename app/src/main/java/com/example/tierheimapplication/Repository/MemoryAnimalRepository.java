package com.example.tierheimapplication.Repository;

import java.util.ArrayList;

import com.example.tierheimapplication.AnimalShelter;
import com.example.tierheimapplication.animals.Animal;



public class MemoryAnimalRepository implements IRepository {

    private ArrayList<Animal> animalList;

    public MemoryAnimalRepository() {
        animalList = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        animalList.add(animal);
        System.out.println("Animal added");
    }

    @Override
    public Animal getAnimal(int id) {
        if (id < 0) {
            return null;
        }

        if (animalList.size() > id) {
            return null;
        }

        return animalList.get(id);
    }

    @Override
    public ArrayList<Animal> getAnimals(String name) {
        if (name == null || name.isEmpty()) {
            return null;
        }

        ArrayList<Animal> animals = new ArrayList<>();

        for (Animal animal : animalList) {
            if (name.equalsIgnoreCase(animal.getName())) {
                animals.add(animal);
            }
        }

        return animals;
    }

    @Override
    public ArrayList<Animal> getAnimals() {
        return animalList;
    }

    @Override
    public void removeAnimal(int id) {
        if (animalList.get(id) == null) {
            System.out.println("there is no animal here to be removed");
            return;
        }

        animalList.remove(id);
        System.out.println("animal successfully removed");

    }

    @Override
    public void updateAnimal(int id, Animal animal) {
        if (animalList.get(id) == null) {
            System.out.println("there is no animal here to be updated");
            return;
        }

        animalList.remove(id);
        animalList.add(id, animal);
        System.out.println("animal successfully updated");
    }

}
