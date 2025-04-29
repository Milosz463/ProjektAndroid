package com.example.myapplication;

import java.util.ArrayList;

public class Gracz {
    ArrayList<Integer> listaZTaliaGracza =new ArrayList<Integer>();
    ArrayList<Integer> wylosowaneKartyGracza =new ArrayList<>();
    ArrayList<Integer> listaWartosciKartGracza=new ArrayList<>();
    ArrayList<Integer> listaKolorowKartGracza=new ArrayList<>();
    int losowaKarta1 = (int) (Math.random() * 52);
    int losowaKarta2 = (int) (Math.random() * 52);
    int wartoscKarty1Gracza;
    int wartroscKarty2Gracza;
    int kolorKarty1Gracza;
    int kolorKarty2Gracza;
    int wynikGracza;
    TaliaKart taliaKart;

    public int getWartoscKarty1Gracza() {
        return wartoscKarty1Gracza;
    }

    public int getWartroscKarty2Gracza() {
        return wartroscKarty2Gracza;
    }

    public int getKolorKarty1Gracza() {
        return kolorKarty1Gracza;
    }

    public int getKolorKarty2Gracza() {
        return kolorKarty2Gracza;
    }

    public int getWynikGracza() {
        return wynikGracza;
    }

    public void setWynikGracza(int wynikGracza) {
        this.wynikGracza = wynikGracza;
    }

    public void losujKartyDlaGracza(){
        taliaKart=new TaliaKart();
        taliaKart.dodajKarty();
        for(Repozytorium kartyGracza:taliaKart.listaKart) {
            listaZTaliaGracza.add(kartyGracza.getNrKarty());
        }
            wylosowaneKartyGracza.add(listaZTaliaGracza.get(losowaKarta1));
            wylosowaneKartyGracza.add(listaZTaliaGracza.get(losowaKarta2));
    }
    public void dodajWartosciKartGracza(){
        taliaKart=new TaliaKart();
        taliaKart.dodajKarty();
        for(Repozytorium wartosciG:taliaKart.listaKart){
            listaWartosciKartGracza.add(wartosciG.getWartoscKarty());
            listaKolorowKartGracza.add(wartosciG.getKolorKarty());
        }
            wartoscKarty1Gracza=listaWartosciKartGracza.get(losowaKarta1);
            wartroscKarty2Gracza=listaWartosciKartGracza.get(losowaKarta2);
            kolorKarty1Gracza = listaKolorowKartGracza.get(losowaKarta1);
            kolorKarty2Gracza = listaKolorowKartGracza.get(losowaKarta2);
    }

}
