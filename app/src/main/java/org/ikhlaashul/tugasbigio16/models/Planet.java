package org.ikhlaashul.tugasbigio16.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by User on 27/10/2016.
 */
public class Planet implements Serializable
{
    public String name;
    public String diameter;
    public String gravity;
    public String population;
    public String climate;
    public String terrain;
    public String created;
    public String edited;
    public String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getSurfaceWater() {
        return surfaceWater;
    }

    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    public ArrayList<String> getResidentsUrls() {
        return residentsUrls;
    }

    public void setResidentsUrls(ArrayList<String> residentsUrls) {
        this.residentsUrls = residentsUrls;
    }

    public ArrayList<String> getFilmsUrls() {
        return filmsUrls;
    }

    public void setFilmsUrls(ArrayList<String> filmsUrls) {
        this.filmsUrls = filmsUrls;
    }

    @SerializedName("rotation_period")
    public String rotationPeriod;

    @SerializedName("orbital_period")
    public String orbitalPeriod;

    @Override
    public String toString() {
        return name + "\n"
                + "Diameter: " + diameter + "\n"
                + "Rotation period(day period): " + rotationPeriod + "\n"
                + "Gravity: " + gravity +"\n"
                + "Population: " + population + "\n"
                + "Climate: " + climate + "\n"
                + "Terrain: " + terrain + "\n"
                + "Surface of water(percentage): " + surfaceWater;
    }

    @SerializedName("surface_water")
    public String surfaceWater;

    @SerializedName("residents")
    public ArrayList<String> residentsUrls;

    @SerializedName("films")
    public ArrayList<String> filmsUrls;
}

