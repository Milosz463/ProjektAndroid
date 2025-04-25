package com.example.myapplication;

import java.util.ArrayList;

public class Stolik {
    ArrayList<Integer> listaKartNaStole =new ArrayList<>();
    ArrayList<Integer> listaWylosowanychKartNaStol=new ArrayList<>();
    ArrayList<Integer>listaWartosciKartNaStole=new ArrayList<>();
    ArrayList<Integer>listaKolorowKartNaStole=new ArrayList<>();
    int losowaKarta1=(int)(Math.random()*52);
    int losowaKarta2=(int)(Math.random()*52);
    int losowaKarta3=(int)(Math.random()*52);
    int losowaKarta4=(int)(Math.random()*52);
    int losowaKarta5=(int)(Math.random()*52);
    TaliaKart taliaKart=new TaliaKart();

    int wartosc1Flop;
    int wartosc2Flop;
    int wartosc3Flop;
    int wartoscTurn;
    int wartoscRiver;

    int kolor1Flop;
    int kolor2Flop;
    int kolor3Flop;
    int kolorTurn;
    int kolorRiver;

    public int getWartosc1Flop() {
        return wartosc1Flop;
    }

    public int getWartosc2Flop() {
        return wartosc2Flop;
    }

    public int getWartosc3Flop() {
        return wartosc3Flop;
    }

    public int getWartoscTurn() {
        return wartoscTurn;
    }

    public int getWartoscRiver() {
        return wartoscRiver;
    }

    public int getKolor2Flop() {
        return kolor2Flop;
    }

    public int getKolor1Flop() {
        return kolor1Flop;
    }

    public int getKolor3Flop() {
        return kolor3Flop;
    }

    public int getKolorTurn() {
        return kolorTurn;
    }

    public int getKolorRiver() {
        return kolorRiver;
    }
    public void losujKartyNaStol(){
        taliaKart.DodajKarty();
        for(Repozytorium repozytorium:taliaKart.listaKart){
            listaKartNaStole.add(repozytorium.getNrKarty());
        }
        listaWylosowanychKartNaStol.add(listaKartNaStole.get(losowaKarta1));
        listaWylosowanychKartNaStol.add(listaKartNaStole.get(losowaKarta2));
        listaWylosowanychKartNaStol.add(listaKartNaStole.get(losowaKarta3));
        listaWylosowanychKartNaStol.add(listaKartNaStole.get(losowaKarta4));
        listaWylosowanychKartNaStol.add(listaKartNaStole.get(losowaKarta5));

    }
    public void dodajWartosciKartNaStol(){
        taliaKart.DodajKarty();
        for(Repozytorium repozytorium:taliaKart.listaKart){
            listaWartosciKartNaStole.add(repozytorium.getWartoscKarty());
            listaKolorowKartNaStole.add(repozytorium.getKolorKarty());
        }
        wartosc1Flop=listaWartosciKartNaStole.get(losowaKarta1);
        wartosc2Flop=listaWartosciKartNaStole.get(losowaKarta2);
        wartosc3Flop=listaWartosciKartNaStole.get(losowaKarta3);
        wartoscTurn=listaWartosciKartNaStole.get(losowaKarta4);
        wartoscRiver=listaWartosciKartNaStole.get(losowaKarta5);

        kolor1Flop=listaKolorowKartNaStole.get(losowaKarta1);
        kolor2Flop=listaKolorowKartNaStole.get(losowaKarta2);
        kolor3Flop=listaKolorowKartNaStole.get(losowaKarta3);
        kolorTurn=listaKolorowKartNaStole.get(losowaKarta4);
        kolorRiver=listaKolorowKartNaStole.get(losowaKarta5);
    }
}
