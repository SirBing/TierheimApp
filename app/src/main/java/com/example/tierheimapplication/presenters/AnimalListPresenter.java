package com.example.tierheimapplication.presenters;

import com.example.tierheimapplication.AnimalShelter;
import com.example.tierheimapplication.animals.Animal;
import com.example.tierheimapplication.viewInterfaces.IAnimalListView;

import java.util.ArrayList;

public class AnimalListPresenter {
    private IAnimalListView animalListView;

    public AnimalListPresenter(IAnimalListView animalListView) {
        this.animalListView = animalListView;
    }

    //fetch data
    public void getCurrentAnimals() {
        ArrayList<Animal> animals = AnimalShelter.getInstance().getList();
        animalListView.updateAnimalList(animals);
    }
}
