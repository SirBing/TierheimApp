package com.example.tierheimapplication.viewHelper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tierheimapplication.R;
import com.example.tierheimapplication.animals.Animal;

import java.util.ArrayList;


public class AnimalAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Animal> animalArrayList;

    /*public  AnimalAdapter(ArrayList<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
    }*/

    public AnimalAdapter() {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Animal animal = animalArrayList.get(position);
        holder.setAnimal(animal);
    }

    @Override
    public int getItemCount() {
        return animalArrayList.size();
    }

    public void updateAnimallist (ArrayList<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
        notifyDataSetChanged();
    }
}
