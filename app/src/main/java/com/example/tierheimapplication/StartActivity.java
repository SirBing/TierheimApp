package com.example.tierheimapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tierheimapplication.viewHelper.AnimalAdapter;

public class StartActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Button addAnimalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        recyclerView = findViewById(R.id.recyclerViewAnimals);

        recyclerView.setAdapter(new AnimalAdapter(AnimalShelter.getInstance().getList()));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        addAnimalButton = findViewById(R.id.addAnimalButton);
        addAnimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(recyclerView.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}