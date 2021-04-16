package com.example.tierheimapplication.shelter;

import com.example.tierheimapplication.animals.Animal;

import java.util.ArrayList;

public class AnimalShelter implements  IRepositoryAnimal{
    ArrayList<Animal> animallist;

    public AnimalShelter () {
        animallist = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animal animal) {
        animallist.add(animal);
    }

    @Override
    public void removeAnimal(String name) {
        for(Animal a: animallist) {
            if(a.getName().equals(name)){
                animallist.remove(a);
                return;
            }
        }
        System.out.println("Konnte das Tier nicht finden. Versuche es bitte erneut.");
    }

    @Override
    public Animal editAnimal(String name) {
        for(Animal a: animallist) {
            if(a.getName().equals(name)){
                //tue vorher irgendwas mit dem tier
                return a;
            }
        }
        return null;
    }

    public ArrayList<Animal> getList() {
        return animallist;
    }
}
