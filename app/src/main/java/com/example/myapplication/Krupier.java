package com.example.myapplication;

import java.util.ArrayList;

public class Krupier {
    ArrayList<Integer> listaZtaliaKrupiera=new ArrayList<>();
    ArrayList<Integer> wylosowaneKartyKrupiera=new ArrayList<>();
    ArrayList<Integer> listaWartosciKartKrupiera=new ArrayList<>();
    ArrayList<Integer> listaKolorowKartKrupiera=new ArrayList<>();
    int losowaKarta1=(int)(Math.random()*52);
    int losowaKarta2=(int)(Math.random()*52);
    int wartoscKarty1Krupiera;
    int wartoscKarty2Krupiera;
    int kolorKarty1Krupiera;
    int kolorKarty2Krupiera;
    int wynikKrupiera;
    TaliaKart taliaKart;

    public int getWartoscKarty1Krupiera() {
        return wartoscKarty1Krupiera;
    }

    public int getWartoscKarty2Krupiera() {
        return wartoscKarty2Krupiera;
    }

    public int getKolorKarty1Krupiera() {
        return kolorKarty1Krupiera;
    }

    public int getKolorKarty2Krupiera() {
        return kolorKarty2Krupiera;
    }

    public int getWynikKrupiera() {
        return wynikKrupiera;
    }

    public void setWynikKrupiera(int wynikKrupiera) {
        this.wynikKrupiera = wynikKrupiera;
    }

    public void losujKartyDlaKrupiera(){
        taliaKart=new TaliaKart();
        taliaKart.dodajKarty();
        for(Repozytorium kartyKrupiera: taliaKart.listaKart){
            listaZtaliaKrupiera.add(kartyKrupiera.getNrKarty());
        }
        wylosowaneKartyKrupiera.add(listaZtaliaKrupiera.get(losowaKarta1));
        wylosowaneKartyKrupiera.add(listaZtaliaKrupiera.get(losowaKarta2));
    }
    public void dodajWartosciKartKrupiera(){
        taliaKart=new TaliaKart();
        taliaKart.dodajKarty();
        for(Repozytorium wartosciK:taliaKart.listaKart){
            listaWartosciKartKrupiera.add(wartosciK.getWartoscKarty());
            listaKolorowKartKrupiera.add(wartosciK.getKolorKarty());
        }

            wartoscKarty1Krupiera=listaWartosciKartKrupiera.get(losowaKarta1);
            wartoscKarty2Krupiera=listaWartosciKartKrupiera.get(losowaKarta2);
            kolorKarty1Krupiera=listaKolorowKartKrupiera.get(losowaKarta1);
            kolorKarty2Krupiera=listaKolorowKartKrupiera.get(losowaKarta2);
    }
}
