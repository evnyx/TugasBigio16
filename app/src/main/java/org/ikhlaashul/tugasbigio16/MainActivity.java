package org.ikhlaashul.tugasbigio16;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    ImageView imgFilm,  imgPeople, imgPlanet, imgSpecies, imgStarship, imgVehicle;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFilm = (ImageView) findViewById(R.id.imgFilm);
        imgPeople = (ImageView) findViewById(R.id.imgPeople);
        imgPlanet = (ImageView) findViewById(R.id.imgPlanets);
        imgSpecies = (ImageView) findViewById(R.id.imgSpecies);
        imgStarship = (ImageView) findViewById(R.id.imgStarships);
        imgVehicle = (ImageView) findViewById(R.id.imgVehicles);

    }

    public void imgPeople_onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, SearchPeople.class);
        startActivity(i);
    }

    public void imgPlanet_onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, SearchPlanets.class);
        startActivity(i);
    }

    public void imgStarship_onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, SearchStarships.class);
        startActivity(i);
    }

    public void imgVehicle_onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, SearchVehicles.class);
        startActivity(i);
    }

    public void imgSpecies_onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, SearchSpecies.class);
        startActivity(i);
    }

    public void imgFilm_onClick(View v)
    {
        Intent i = new Intent(MainActivity.this, SearchFilms.class);
        startActivity(i);
    }

}
