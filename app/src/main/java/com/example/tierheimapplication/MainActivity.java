package com.example.tierheimapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tierheimapplication.animals.Dog;

public class MainActivity extends AppCompatActivity {

    Button buttonAddDog;
    Button buttonAddCat;
    Button buttonAddRabbit;
    Button buttonAddBird;

    EditText namefield;
    EditText geschlechtfield;
    EditText rassefield;
    EditText geburtsjahrfield;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namefield = findViewById(R.id.namefield);
        geschlechtfield = findViewById(R.id.geschlechtfield);
        rassefield = findViewById(R.id.rassefield);
        geburtsjahrfield = findViewById(R.id.geburtsjahrfield);

        buttonAddDog = findViewById(R.id.addDogButton);
        buttonAddDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = namefield.getText().toString();
                String geschlecht = geschlechtfield.getText().toString();
                String rasse = rassefield.getText().toString();
                int geburtsjahr = Integer.parseInt(geburtsjahrfield.getText().toString());
                Dog dog = new Dog(name, geschlecht, rasse, geburtsjahr);

            }
        });



    }
}