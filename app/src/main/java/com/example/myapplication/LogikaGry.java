package com.example.myapplication;

public class LogikaGry {
    Gracz gracz;
    Krupier krupier;
    Stolik stolik;

    int[] tablicaFlop;

    public LogikaGry(Gracz gracz, Krupier krupier, Stolik stolik) {
        this.gracz = gracz;
        this.krupier = krupier;
        this.stolik = stolik;
    }

    public void DodajWartosci() {
        gracz.dodajWartosciKartGracza();
        krupier.dodajWartosciKartKrupiera();
        stolik.dodajWartosciKartNaStol();

        tablicaFlop = new int[]{
                stolik.getWartosc1Flop(),
                stolik.getWartosc2Flop(),
                stolik.getWartosc3Flop(),
                stolik.getKolor1Flop(),
                stolik.getKolor2Flop(),
                stolik.getKolor3Flop()
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

        gracz.setWynikGracza(gracz.getWynikGracza() + ileTrafien(tablicaFlop, gracz.getWartoscKarty1Gracza()));
        gracz.setWynikGracza(gracz.getWynikGracza() + ileTrafien(tablicaFlop, gracz.getWartroscKarty2Gracza()));
        gracz.setWynikGracza(gracz.getWynikGracza() + ileTrafien(tablicaFlop, gracz.getKolorKarty1Gracza()));
        gracz.setWynikGracza(gracz.getWynikGracza() + ileTrafien(tablicaFlop, gracz.getKolorKarty2Gracza()));
    }

    public void LiczPunktyKrupiera() {
        krupier.setWynikKrupiera(krupier.getWynikKrupiera() + ileTrafien(tablicaFlop, krupier.getWartoscKarty1Krupiera()));
        krupier.setWynikKrupiera(krupier.getWynikKrupiera() + ileTrafien(tablicaFlop, krupier.getWartoscKarty2Krupiera()));
        krupier.setWynikKrupiera(krupier.getWynikKrupiera() + ileTrafien(tablicaFlop, krupier.getKolorKarty1Krupiera()));
        krupier.setWynikKrupiera(krupier.getWynikKrupiera() + ileTrafien(tablicaFlop, krupier.getKolorKarty2Krupiera()));
    }
}
