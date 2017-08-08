package models;

import java.util.ArrayList;

/**
 * Created by Guest on 8/8/17.
 */
public class CD {
    private String name;
    private String artist;
    private Integer year;
    private Double price;
    private static ArrayList<CD> instances = new ArrayList<>();

    public CD(String name, String artist, Integer year, Double price) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.price = price;
        this.instances.add(this);
    }

//getters
    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public Integer getYear() {
        return year;
    }

    public Double getPrice() {
        return price;
    }




    public static ArrayList<CD> getAll(){
        return instances;
    }









}
