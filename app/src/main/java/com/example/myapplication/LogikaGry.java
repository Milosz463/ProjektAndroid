package com.example.myapplication;

public class LogikaGry {
    Gracz gracz;
    Krupier krupier;
    Stolik stolik;

    int[] tablicaKartZeStolu;
    int[]tablicaRiver;
    int[]tablicaTurn;

    public LogikaGry(Gracz gracz, Krupier krupier, Stolik stolik) {
        this.gracz = gracz;
        this.krupier = krupier;
        this.stolik = stolik;
    }

    public void DodajWartosci() {
        gracz.dodajWartosciKartGracza();
        krupier.dodajWartosciKartKrupiera();
        stolik.dodajWartosciKartNaStol();

        tablicaKartZeStolu = new int[]{
                stolik.getWartosc1Flop(),
                stolik.getWartosc2Flop(),
                stolik.getWartosc3Flop(),
                stolik.getKolor1Flop(),
                stolik.getKolor2Flop(),
                stolik.getKolor3Flop(),
                stolik.getWartoscRiver(),
                stolik.getKolorRiver(),
                stolik.getWartoscTurn(),
                stolik.getKolorTurn()
        };


    }

    public int ileTrafien(int[] tablica, int wartosc) {
        int licznik = 0;
        for (int karta : tablica) {
            if (wartosc == karta) {
                licznik++;
            }
        }
        return licznik;
    }

    public void LiczPunktyGracza() {
        DodajWartosci();

        gracz.setWynikGracza(gracz.getWynikGracza() + ileTrafien(tablicaKartZeStolu, gracz.getWartoscKarty1Gracza()));
        gracz.setWynikGracza(gracz.getWynikGracza() + ileTrafien(tablicaKartZeStolu, gracz.getWartroscKarty2Gracza()));
        gracz.setWynikGracza(gracz.getWynikGracza() + ileTrafien(tablicaKartZeStolu, gracz.getKolorKarty1Gracza()));
        gracz.setWynikGracza(gracz.getWynikGracza() + ileTrafien(tablicaKartZeStolu, gracz.getKolorKarty2Gracza()));
    }

    public void LiczPunktyKrupiera() {
        krupier.setWynikKrupiera(krupier.getWynikKrupiera() + ileTrafien(tablicaKartZeStolu, krupier.getWartoscKarty1Krupiera()));
        krupier.setWynikKrupiera(krupier.getWynikKrupiera() + ileTrafien(tablicaKartZeStolu, krupier.getWartoscKarty2Krupiera()));
        krupier.setWynikKrupiera(krupier.getWynikKrupiera() + ileTrafien(tablicaKartZeStolu, krupier.getKolorKarty1Krupiera()));
        krupier.setWynikKrupiera(krupier.getWynikKrupiera() + ileTrafien(tablicaKartZeStolu, krupier.getKolorKarty2Krupiera()));
    }
}
