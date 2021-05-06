package com.example.tierheimapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tierheimapplication.animals.*;
import com.example.tierheimapplication.presenters.AnimalAddPresenter;
import com.example.tierheimapplication.viewInterfaces.IAnimalAddView;

public class ActivityAdd extends AppCompatActivity implements IAnimalAddView {

    private Button addButton;

    private RadioGroup radioGroupAnimalType;

    private EditText namefield;
    private EditText genderfield;
    private EditText racefield;
    private EditText yearOfBirthfield;

    private AnimalAddPresenter animalAddPresenter;

    public ActivityAdd() {
        animalAddPresenter = new AnimalAddPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupAnimalType = findViewById(R.id.radioGroupAnimalType);

        namefield = findViewById(R.id.namefield);
        genderfield = findViewById(R.id.genderfield);
        racefield = findViewById(R.id.racefield);
        yearOfBirthfield = findViewById(R.id.yearOfBirthfield);

        addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String name = namefield.getText().toString();
            String gender = genderfield.getText().toString();
            String race = racefield.getText().toString();
            int yearOfBirth = Integer.parseInt(yearOfBirthfield.getText().toString());

            int radioButtonId = radioGroupAnimalType.getCheckedRadioButtonId();
            RadioButton selectedRadioButton = findViewById(radioButtonId);
            String selectedText = null;

            if(selectedRadioButton != null) {
                selectedText = selectedRadioButton.getText().toString();
            }

            Animal animal = null;

            switch (selectedText) {
                case "Dog":
                    animal = new Dog(name, gender, race, yearOfBirth);
                    break;
                case "Cat":
                    animal = new Cat(name, gender, race, yearOfBirth);
                    break;
                case "Bird":
                    animal = new Bird(name, gender, race, yearOfBirth);
                    break;
                case "Rabbit":
                    animal = new Rabbit(name, gender, race, yearOfBirth);
                    break;
                default:
                    return;
            }
            animalAddPresenter.addAnimal(animal);
        }
        });
    }

    @Override
    public void animalAddedFailed(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void animalAddedSuccesfull() {
        finish();
    }
}