package com.example.myapplication;

import java.util.ArrayList;

public class Repozytorium {
    Integer nrKarty;
    int wartoscKarty;
    ArrayList<Repozytorium>listaKart=new ArrayList<>();

    public Repozytorium(Integer nrKarty, int wartoscKarty) {
        this.nrKarty = nrKarty;
        this.wartoscKarty = wartoscKarty;
    }

    public Repozytorium() {
    }

    public Integer getNrKarty() {
        return nrKarty;
    }

    public void setNrKarty(Integer nrKarty) {
        this.nrKarty = nrKarty;
    }

    public int getWartoscKarty() {
        return wartoscKarty;
    }

    public void setWartoscKarty(int wartoscKarty) {
        this.wartoscKarty = wartoscKarty;
    }
}
