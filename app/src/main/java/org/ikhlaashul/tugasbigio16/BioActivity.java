package org.ikhlaashul.tugasbigio16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.ikhlaashul.tugasbigio16.models.Film;
import org.ikhlaashul.tugasbigio16.models.People;
import org.ikhlaashul.tugasbigio16.models.Planet;
import org.ikhlaashul.tugasbigio16.models.Root;
import org.ikhlaashul.tugasbigio16.models.SWModelList;
import org.ikhlaashul.tugasbigio16.models.Species;
import org.ikhlaashul.tugasbigio16.models.Starship;
import org.ikhlaashul.tugasbigio16.models.Vehicle;
import org.ikhlaashul.tugasbigio16.sw.StarWars;

import retrofit.Callback;

public class BioActivity extends AppCompatActivity {
    StarWars sw;
    People people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        sw = new StarWars() {
            @Override
            public void getRootUrls(Callback< Root > callback) {

            }

            @Override
            public void getAllPeople(int page, Callback<SWModelList<People>> callback) {

            }

            @Override
            public void getPeople(int peopleId, Callback<People> callback) {

            }

            @Override
            public void getAllFilms(int page, Callback<SWModelList<Film>> callback) {

            }

            @Override
            public void getFilm(int filmId, Callback<Film> callback) {

            }

            @Override
            public void getAllStarships(int page, Callback<SWModelList<Starship>> callback) {

            }

            @Override
            public void getStarship(int starshipId, Callback<Starship> callback) {

            }

            @Override
            public void getAllVehicles(int page, Callback<SWModelList<Vehicle>> callback) {

            }

            @Override
            public void getVehicle(int vehicleId, Callback<Vehicle> callback) {

            }

            @Override
            public void getAllSpecies(int page, Callback<SWModelList<Species>> callback) {

            }

            @Override
            public void getSpecies(int speciesId, Callback<Species> callback) {

            }

            @Override
            public void getAllPlanets(int page, Callback<SWModelList<Planet>> callback) {

            }

            @Override
            public void getPlanet(int planetId, Callback<Planet> callback) {

            }
        };

        int peopleID = getIntent().getIntExtra("peopleID",1);
        sw.getAllPeople(peopleID,people);


    }
}