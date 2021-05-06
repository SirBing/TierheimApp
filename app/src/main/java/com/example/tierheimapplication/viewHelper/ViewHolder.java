package com.example.tierheimapplication.viewHelper;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tierheimapplication.R;
import com.example.tierheimapplication.animals.Animal;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView name_row_item;
    private TextView race_row_item;
    private TextView gender_row_item;
    private TextView yearOfBirth_row_item;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        name_row_item = itemView.findViewById(R.id.name_row_item);
        race_row_item = itemView.findViewById(R.id.race_row_item);
        gender_row_item = itemView.findViewById(R.id.gender_row_item);
        yearOfBirth_row_item = itemView.findViewById(R.id.yearOfBirth_row_item);
    }

    public void setAnimal(Animal animal) {
        name_row_item.setText(animal.getName());
        race_row_item.setText((animal.getRace()));
        gender_row_item.setText(animal.getGender());
        int yearOfBirth = animal.getYearOfBirth();
        yearOfBirth_row_item.setText(String.valueOf(yearOfBirth));

    }

}
