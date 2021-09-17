package org.ikhlaashul.tugasbigio16.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Species implements Serializable
{
    public String name;
    public String classification;
    public String designation;

    @SerializedName("average_height")
    public String averageHeight;

    @SerializedName("average_lifespan")
    public String averageLifespan;

    @SerializedName("eye_colors")
    public String eyeColors;

    public ArrayList<String> getFilmsUrls() {
        return filmsUrls;
    }

    public void setFilmsUrls(ArrayList<String> filmsUrls) {
        this.filmsUrls = filmsUrls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(String averageHeight) {
        this.averageHeight = averageHeight;
    }

    public String getAverageLifespan() {
        return averageLifespan;
    }

    @Override
    public String toString()
    {
        return name + "\n"
                + "Classification: " + classification + "\n"
                + "Designation: " + designation + "\n"
                + "Average height: " + averageHeight + "\n"
                + "Average lifespan: " + averageLifespan + "\n"
                + "Eye colors: " + eyeColors + "\n"
                + "Hair colors: " + hairColors + "\n"
                + "Skin colors: " + skinColors + "\n"
                + "Language: " + language;
    }

    public void setAverageLifespan(String averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public String getEyeColors() {
        return eyeColors;
    }

    public void setEyeColors(String eyeColors) {
        this.eyeColors = eyeColors;
    }

    public String getHairColors() {
        return hairColors;
    }

    public void setHairColors(String hairColors) {
        this.hairColors = hairColors;
    }

    public String getSkinColors() {
        return skinColors;
    }

    public void setSkinColors(String skinColors) {
        this.skinColors = skinColors;
    }

    public String getHomeWorld() {
        return homeWorld;
    }

    public void setHomeWorld(String homeWorld) {
        this.homeWorld = homeWorld;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    public ArrayList<String> getPeopleUrls() {
        return peopleUrls;
    }

    public void setPeopleUrls(ArrayList<String> peopleUrls) {
        this.peopleUrls = peopleUrls;
    }

    @SerializedName("hair_colors")
    public String hairColors;

    @SerializedName("skin_colors")
    public String skinColors;

    @SerializedName("homeworld")
    public String homeWorld;

    public String language;
    public String created;
    public String edited;
    public String url;

    @SerializedName("people")
    public ArrayList<String> peopleUrls;

    @SerializedName("films")
    public ArrayList<String> filmsUrls;
}