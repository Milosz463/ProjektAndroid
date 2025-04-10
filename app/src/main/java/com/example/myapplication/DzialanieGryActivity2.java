package com.example.myapplication;

import static android.view.View.INVISIBLE;

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
TaliaKart taliaKart;
int losowaKarta1;
int losowaKarta2;
ArrayList<Integer> listaZTalia=new ArrayList<Integer>();
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

        binding.button12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        LosujKartyDlaGracza();
                        binding.button12.setVisibility(INVISIBLE);
                    }
                }
        );
    }
    public void LosujKartyDlaGracza(){
        taliaKart=new TaliaKart();
        taliaKart.DodajKarty();
        for(Repozytorium karty:taliaKart.listaKart){
            listaZTalia.add(karty.getNrKarty());
        }
        losowaKarta1=(int)(Math.random()*53);
        losowaKarta2=(int)(Math.random()*53);
        binding.imageView8.setImageResource(listaZTalia.get(losowaKarta1));
        binding.imageView9.setImageResource(listaZTalia.get(losowaKarta2));
    }
}