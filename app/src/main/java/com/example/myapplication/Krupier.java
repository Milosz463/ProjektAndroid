package com.example.myapplication;

import java.util.ArrayList;

public class Krupier {
    ArrayList<Integer> listaZtaliaKrupiera=new ArrayList<>();
    ArrayList<Integer> wylosowaneKartyKrupiera=new ArrayList<>();
    ArrayList<Integer> listaWartosciKartKrupiera=new ArrayList<>();
    int wartoscKarty1Krupiera;
    int wartoscKarty2Krupiera;
    int losowaKarta1=(int)(Math.random()*52);
    int losowaKarta2=(int)(Math.random()*52);
    public void losujKartyDlaKrupiera(){
        TaliaKart taliaKart=new TaliaKart();
        taliaKart.DodajKarty();
        for(Repozytorium kartyKrupiera: taliaKart.listaKart){
            listaZtaliaKrupiera.add(kartyKrupiera.getNrKarty());
        }
        wylosowaneKartyKrupiera.add(listaZtaliaKrupiera.get(losowaKarta1));
        wylosowaneKartyKrupiera.add(listaZtaliaKrupiera.get(losowaKarta2));
    }
    public void dodajWartosciKartKrupiera(){
        TaliaKart taliaKart=new TaliaKart();
        taliaKart.DodajKarty();
        for(Repozytorium wartosciK:taliaKart.listaKart){
            listaWartosciKartKrupiera.add(wartosciK.getWartoscKarty());
        }

            wartoscKarty1Krupiera=listaZtaliaKrupiera.get(losowaKarta2);
            wartoscKarty2Krupiera=listaZtaliaKrupiera.get(losowaKarta2);
    }
}
