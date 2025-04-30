package com.example.myapplication;

public class Przyciski {
    int Budzet=1000;
    int PostawionyBudzet;
    Gracz gracz=new Gracz();
    Krupier krupier=new Krupier();
    Stolik stolik=new Stolik();
    LogikaGry logikaGry;
    int czyWygrana;

    public int getBudzet() {
        return Budzet;
    }

    public void setBudzet(int budzet) {
        Budzet = budzet;
    }

    public int getPostawionyBudzet() {
        return PostawionyBudzet;
    }

    public void setPostawionyBudzet(int postawionyBudzet) {
        PostawionyBudzet = postawionyBudzet;
    }

    public void StawPieniadze(){
        Budzet=Budzet-PostawionyBudzet;
    }
    public void SprawdzWyniki(){
        logikaGry=new LogikaGry(gracz,krupier,stolik);
        logikaGry.gracz = this.gracz;
        logikaGry.krupier = this.krupier;
        logikaGry.stolik = this.stolik;

        gracz.dodajWartosciKartGracza();
        krupier.dodajWartosciKartKrupiera();
        stolik.dodajWartosciKartNaStol();

        logikaGry.dodajWartosci();

        logikaGry.liczPunktyGracza();
        logikaGry.liczPunktyKrupiera();

        System.out.println("Gracz punkty: " + gracz.getWynikGracza());
        System.out.println("Krupier punkty: " + krupier.getWynikKrupiera());
        if(gracz.getWynikGracza()>krupier.getWynikKrupiera()){
            Budzet=Budzet+(PostawionyBudzet*PostawionyBudzet);
            czyWygrana=1;
        }
        else if(gracz.getWynikGracza()<krupier.getWynikKrupiera()){
            Budzet=Budzet-PostawionyBudzet;
            czyWygrana=2;
        }else{
            Budzet=1000;
            czyWygrana=3;
        }
    }
}
