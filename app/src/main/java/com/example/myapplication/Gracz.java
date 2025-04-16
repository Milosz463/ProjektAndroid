package com.example.myapplication;

import java.util.ArrayList;

public class Gracz {
    ArrayList<Integer> listaZTaliaGracza =new ArrayList<Integer>();
    ArrayList<Integer> wylosowaneKartyGracza =new ArrayList<>();
    ArrayList<Integer> listaWartosciKartGracza=new ArrayList<>();
    int losowaKarta1 = (int) (Math.random() * 52);
    int losowaKarta2 = (int) (Math.random() * 52);
    int wartoscKarty1Gracza;
    int wartroscKarty2Gracza;
    TaliaKart taliaKart;
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
        }
            wartoscKarty1Gracza=listaWartosciKartGracza.get(losowaKarta1);
            wartroscKarty2Gracza=listaWartosciKartGracza.get(losowaKarta2);
    }

}
