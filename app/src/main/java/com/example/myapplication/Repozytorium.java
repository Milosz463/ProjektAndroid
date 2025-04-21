package com.example.myapplication;

import java.util.ArrayList;

public class Repozytorium {
    Integer nrKarty;
    int wartoscKarty;
    int kolorKarty;

    public Repozytorium(Integer nrKarty, int wartoscKarty, int kolorKarty) {
        this.nrKarty = nrKarty;
        this.wartoscKarty = wartoscKarty;
        this.kolorKarty = kolorKarty;
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

    public int getKolorKarty() {
        return kolorKarty;
    }

    public void setKolorKarty(int kolorKarty) {
        this.kolorKarty = kolorKarty;
    }
}
