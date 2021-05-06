package com.example.tierheimapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tierheimapplication.animals.Animal;
import com.example.tierheimapplication.presenters.AnimalListPresenter;
import com.example.tierheimapplication.viewHelper.AnimalAdapter;
import com.example.tierheimapplication.viewInterfaces.IAnimalListView;

import java.util.ArrayList;

public class ActivityList extends AppCompatActivity implements IAnimalListView {

    private RecyclerView recyclerView;
    private Button addAnimalButton;
    private AnimalAdapter animalAdapter;

    private AnimalListPresenter animalListPresenter;

    public ActivityList() {
        animalListPresenter = new AnimalListPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        recyclerView = findViewById(R.id.recyclerViewAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        animalAdapter = new AnimalAdapter();
        recyclerView.setAdapter(animalAdapter);

        addAnimalButton = findViewById(R.id.addAnimalButton);
        addAnimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(recyclerView.getContext(), ActivityAdd.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        //fetch data
        animalListPresenter.getCurrentAnimals();
    }

    @Override
    public void updateAnimalList(ArrayList<Animal> animalArrayList) {
        animalAdapter.updateAnimallist(animalArrayList);
    }
}