package com.example.myapplication;

public class LogikaGry {
    Gracz gracz;
    Krupier krupier;
    Stolik stolik;

    int wartoscGracza1=gracz.getWartoscKarty1Gracza();
    int wartoscGracza2=gracz.getWartroscKarty2Gracza();
    int kolorGracza1=gracz.getKolorKarty1Gracza();
    int kolorGracza2=gracz.getKolorKarty2Gracza();
    int wartoscKrupiera1=krupier.getWartoscKarty1Krupiera();
    int wartoscKrupiera2=krupier.getWartoscKarty2Krupiera();
    int kolorKrupiera1=krupier.getKolorKarty1Krupiera();
    int kolorKrupiera2=krupier.getKolorKarty2Krupiera();
    int wartoscFlop1= stolik.getWartosc1Flop();
    int wartoscFlop2= stolik.getWartosc2Flop();
    int wartoscFlop3= stolik.getWartosc3Flop();
    int kolorFlop1= stolik.getKolor1Flop();
    int kolorFlop2= stolik.getKolor2Flop();
    int kolorFlop3= stolik.getKolor3Flop();
    int wartoscTurn=stolik.getWartoscTurn();
    int kolorTurn= stolik.getKolorTurn();
    int wartoscRiver= stolik.getWartoscRiver();
    int kolorRiver=stolik.getKolorRiver();
    int[]tablicaFlop={wartoscFlop1,wartoscFlop2,wartoscFlop3,kolorFlop1,kolorFlop2,kolorFlop3};

    public boolean SprawdzKarty(int[]tablica,int wartosc){
        for(int karta:tablica){
            if(karta==wartosc){
                return  true;
            }
        }
        return false;
    }
    public void LiczPunktyGracza() {
        if (SprawdzKarty(tablicaFlop, wartoscGracza1)) {gracz.setWynikGracza(gracz.wynikGracza++);}
        if (SprawdzKarty(tablicaFlop, wartoscGracza2)) {gracz.setWynikGracza(gracz.wynikGracza++);}
        if (SprawdzKarty(tablicaFlop, kolorGracza1)) {gracz.setWynikGracza(gracz.wynikGracza++);}
        if (SprawdzKarty(tablicaFlop, kolorGracza2)) {gracz.setWynikGracza(gracz.wynikGracza++);}
    }
    public void LiczPunkrtKrupiera(){
        if(SprawdzKarty(tablicaFlop,wartoscKrupiera1)){krupier.setWynikKrupiera(krupier.wynikKrupiera++);}
        if(SprawdzKarty(tablicaFlop,wartoscKrupiera2)){krupier.setWynikKrupiera(krupier.wynikKrupiera++);}
        if(SprawdzKarty(tablicaFlop,kolorKrupiera1)){krupier.setWynikKrupiera(krupier.wynikKrupiera++);}
        if(SprawdzKarty(tablicaFlop,kolorKrupiera2)){krupier.setWynikKrupiera(krupier.wynikKrupiera++);}
    }
}
