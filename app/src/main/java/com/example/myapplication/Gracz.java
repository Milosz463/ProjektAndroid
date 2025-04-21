package com.example.myapplication;

import java.util.ArrayList;

public class Gracz {
    ArrayList<Integer> listaZTaliaGracza =new ArrayList<Integer>();
    ArrayList<Integer> wylosowaneKartyGracza =new ArrayList<>();
    ArrayList<Integer> listaWartosciKartGracza=new ArrayList<>();
    ArrayList<Integer>listaKolorowKartKrupiera=new ArrayList<>();
    int losowaKarta1 = (int) (Math.random() * 52);
    int losowaKarta2 = (int) (Math.random() * 52);
    int wartoscKarty1Gracza;
    int wartroscKarty2Gracza;
    int kolorKarty1Krupiera;
    int kolorKarty2Krupiera;
    TaliaKart taliaKart;

    public int getWartoscKarty1Gracza() {
        return wartoscKarty1Gracza;
    }

    public int getWartroscKarty2Gracza() {
        return wartroscKarty2Gracza;
    }

    public int getKolorKarty1Krupiera() {
        return kolorKarty1Krupiera;
    }

    public int getKolorKarty2Krupiera() {
        return kolorKarty2Krupiera;
    }

    public void losujKartyDlaGracza(){
        taliaKart=new TaliaKart();
        taliaKart.DodajKarty();
        for(Repozytorium kartyGracza:taliaKart.listaKart) {
            listaZTaliaGracza.add(kartyGracza.getNrKarty());
        }
            wylosowaneKartyGracza.add(listaZTaliaGracza.get(losowaKarta1));
            wylosowaneKartyGracza.add(listaZTaliaGracza.get(losowaKarta2));
    }
    public void dodajWartosciKartGracza(){
        taliaKart=new TaliaKart();
        taliaKart.DodajKarty();
        for(Repozytorium wartosciG:taliaKart.listaKart){
            listaWartosciKartGracza.add(wartosciG.getWartoscKarty());
            listaKolorowKartKrupiera.add(wartosciG.getKolorKarty());
        }
            wartoscKarty1Gracza=listaWartosciKartGracza.get(losowaKarta1);
            wartroscKarty2Gracza=listaWartosciKartGracza.get(losowaKarta2);
            kolorKarty1Krupiera=listaKolorowKartKrupiera.get(losowaKarta1);
            kolorKarty2Krupiera=listaKolorowKartKrupiera.get(losowaKarta2);
    }

}
