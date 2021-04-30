package com.example.tierheimapplication.presenters;

import com.example.tierheimapplication.AnimalShelter;
import com.example.tierheimapplication.animals.Animal;
import com.example.tierheimapplication.viewInterfaces.IAnimalAddView;

public class AnimalAddPresenter {
    private IAnimalAddView animalAddView;

    public AnimalAddPresenter(IAnimalAddView animalAddView) {
        this.animalAddView = animalAddView;
    }

    public void addAnimal(Animal animal) {
        if (animal == null) {
            animalAddView.animalAddedFailed("No animal.");
            return;
        }

        if (animal.getName() == null || animal.getName().isEmpty()) {
            animalAddView.animalAddedFailed("Add a name for the animal.");
            return;
        }

        AnimalShelter.getInstance().addAnimal(animal);
        animalAddView.animalAddedSuccesfull();
    }
}
