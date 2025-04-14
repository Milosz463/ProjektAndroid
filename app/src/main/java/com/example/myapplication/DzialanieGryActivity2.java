package com.example.myapplication;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.databinding.ActivityDzialanieGry2Binding;

import java.util.ArrayList;

public class DzialanieGryActivity2 extends AppCompatActivity {
ActivityDzialanieGry2Binding binding;
ArrayList<Integer>listaWylosowanychKartNaStol=new ArrayList<>();
int losowaKarta1=(int)(Math.random()*52);
int losowaKarta2=(int)(Math.random()*52);
int losowaKarta3=(int)(Math.random()*52);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dzialanie_gry2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding=ActivityDzialanieGry2Binding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        UkryjPrzyciski();
        binding.button12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        LosujKartyDlaGracza();
                        LosujKartyNaStol();
                        binding.button12.setVisibility(INVISIBLE);
                        binding.button8.setVisibility(VISIBLE);
                        binding.button9.setVisibility(VISIBLE);
                        binding.button10.setVisibility(VISIBLE);
                        binding.button11.setVisibility(VISIBLE);
                    }
                }
        );
    }
    public void UkryjPrzyciski(){
        binding.button8.setVisibility(INVISIBLE);
        binding.button9.setVisibility(INVISIBLE);
        binding.button10.setVisibility(INVISIBLE);
        binding.button11.setVisibility(INVISIBLE);
    }
    public void LosujKartyDlaGracza(){
        Gracz gracz=new Gracz();
        gracz.losujKartyDlaGracza();
            binding.imageView8.setImageResource(gracz.wylosowaneKartyGracza.get(0));
            binding.imageView9.setImageResource(gracz.wylosowaneKartyGracza.get(1));

    }
    public void LosujKartyNaStol(){
        TaliaKart taliaKart=new TaliaKart();
        taliaKart.DodajKarty();
        for(Repozytorium repozytorium:taliaKart.listaKart){
            listaWylosowanychKartNaStol.add(repozytorium.getNrKarty());
        }
        binding.imageView.setImageResource(listaWylosowanychKartNaStol.get(losowaKarta1));
        binding.imageView3.setImageResource(listaWylosowanychKartNaStol.get(losowaKarta2));
        binding.imageView4.setImageResource(listaWylosowanychKartNaStol.get(losowaKarta3));
    }
}