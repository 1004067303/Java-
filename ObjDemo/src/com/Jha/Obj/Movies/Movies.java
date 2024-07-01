package com.Jha.Obj.Movies;

public class Movies {
    private int ID;
    private String Name;
    private Double Price;

    public Movies() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Movies(int ID, String name, Double price) {
        this.ID = ID;
        Name = name;
        Price = price;
    }
}
