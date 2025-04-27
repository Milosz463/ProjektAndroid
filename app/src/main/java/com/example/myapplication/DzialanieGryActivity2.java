package com.example.myapplication;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.databinding.ActivityDzialanieGry2Binding;

public class DzialanieGryActivity2 extends AppCompatActivity {
ActivityDzialanieGry2Binding binding;

int etapRozdania=0;
int PostawionyBudzet;
CountDownTimer countDownTimer;
boolean czyRaiseZostanieWykonany=false;
boolean czyGraczJuzWylosowalKarty =false;
boolean czyKrupierJuzWylosowalKarty=false;
boolean czyWylosowanoKartyNaStol=false;
Krupier krupier;
Gracz gracz;
Stolik stolik;
LogikaGry logikaGry;
Przyciski przyciski=new Przyciski();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
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

        binding.button2.setVisibility(INVISIBLE);
        binding.button3.setVisibility(INVISIBLE);

        binding.button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        przyciski.setPostawionyBudzet(5);
                        przyciski.StawPieniadze();
                        binding.textView.setText("Budżet: "+String.valueOf(przyciski.getBudzet()));
                        binding.textView4.setText("- "+String.valueOf(przyciski.getPostawionyBudzet()));
                        LosujKartyDlaGracza();
                        LosujKartyDlaKrupiera();
                        Flop();
                        UkryjPrzyciski();
                        if(!czyRaiseZostanieWykonany) {
                            Raise();
                            czyRaiseZostanieWykonany=true;
                        }
                    }
                }
        );
        binding.button9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        przyciski.setPostawionyBudzet(10);
                        przyciski.StawPieniadze();
                        binding.textView.setText("Budżet: "+String.valueOf(przyciski.getBudzet()));
                        binding.textView4.setText("- "+String.valueOf(przyciski.getPostawionyBudzet()));
                        LosujKartyDlaGracza();
                        LosujKartyDlaKrupiera();
                        Flop();
                        UkryjPrzyciski();
                        if(!czyRaiseZostanieWykonany) {
                            Raise();
                            czyRaiseZostanieWykonany=true;
                        }
                    }
                }
        );
        binding.button10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        przyciski.setPostawionyBudzet(15);
                        przyciski.StawPieniadze();
                        binding.textView.setText("Budżet: "+String.valueOf(przyciski.getBudzet()));
                        binding.textView4.setText("- "+String.valueOf(przyciski.getPostawionyBudzet()));
                        LosujKartyDlaGracza();
                        LosujKartyDlaKrupiera();
                        Flop();
                        UkryjPrzyciski();
                        if(!czyRaiseZostanieWykonany) {
                            Raise();
                            czyRaiseZostanieWykonany=true;
                        }
                    }
                }
        );
        binding.button11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        przyciski.setPostawionyBudzet(25);
                        przyciski.StawPieniadze();
                        binding.textView.setText("Budżet: "+String.valueOf(przyciski.getBudzet()));
                        binding.textView4.setText("- "+String.valueOf(przyciski.getPostawionyBudzet()));
                        LosujKartyDlaGracza();
                        LosujKartyDlaKrupiera();
                        Flop();
                        UkryjPrzyciski();
                        if(!czyRaiseZostanieWykonany) {
                            Raise();
                            czyRaiseZostanieWykonany=true;
                        }
                    }
                }
        );
        binding.button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Raise();
                        etapRozdania++;
                        if(etapRozdania% 2 == 0){
                            River();
                            binding.imageView10.setImageResource(krupier.wylosowaneKartyKrupiera.get(0));
                            binding.imageView11.setImageResource(krupier.wylosowaneKartyKrupiera.get(1));
                            przyciski.SprawdzWyniki();
                            binding.textView.setText("Budżet: "+String.valueOf(przyciski.getBudzet()));
                            if(przyciski.czyWygrana==1){
                                binding.textView4.setText("You win!");
                                binding.textView4.setTextColor(Color.GREEN);
                            }else if(przyciski.czyWygrana==2){
                                binding.textView4.setText("You loose!");
                                binding.textView4.setTextColor(Color.RED);
                            }else{
                                binding.textView4.setText("Draw!");
                            }
                        }else {
                            Turn();
                            UkryjPrzyciski();
                        };
                    }
                }
        );
        binding.button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        PokazPrzyciski();
                    }
                }
        );
    }
    public void UkryjPrzyciski(){
        binding.button2.setVisibility(INVISIBLE);
        binding.button3.setVisibility(INVISIBLE);
        binding.button8.setVisibility(INVISIBLE);
        binding.button9.setVisibility(INVISIBLE);
        binding.button10.setVisibility(INVISIBLE);
        binding.button11.setVisibility(INVISIBLE);
    }
    public void PokazPrzyciski(){
        binding.button8.setVisibility(VISIBLE);
        binding.button9.setVisibility(VISIBLE);
        binding.button10.setVisibility(VISIBLE);
        binding.button11.setVisibility(VISIBLE);
    }
    public void LosujKartyDlaGracza(){
        if(!czyGraczJuzWylosowalKarty) {
            gracz = new Gracz();
            gracz.losujKartyDlaGracza();
            czyGraczJuzWylosowalKarty =true;
            binding.imageView8.setImageResource(gracz.wylosowaneKartyGracza.get(0));
            binding.imageView9.setImageResource(gracz.wylosowaneKartyGracza.get(1));
        }
    }
    public void LosujKartyDlaKrupiera(){
        if(!czyKrupierJuzWylosowalKarty){
            krupier=new Krupier();
            krupier.losujKartyDlaKrupiera();
            czyKrupierJuzWylosowalKarty =true;
        }
    }
    public void Flop(){
        if(!czyWylosowanoKartyNaStol) {
            stolik=new Stolik();
            stolik.losujKartyNaStol();
            czyWylosowanoKartyNaStol=true;
            binding.imageView.setImageResource(stolik.listaWylosowanychKartNaStol.get(0));
            binding.imageView3.setImageResource(stolik.listaWylosowanychKartNaStol.get(1));
            binding.imageView4.setImageResource(stolik.listaWylosowanychKartNaStol.get(2));
        }
    }
    public void Turn(){
        binding.imageView5.setImageResource(stolik.listaWylosowanychKartNaStol.get(3));
    }
    public void River(){
        binding.imageView6.setImageResource(stolik.listaWylosowanychKartNaStol.get(4));;
    }
    public void Raise(){
        if(etapRozdania<1) {
            countDownTimer = new CountDownTimer(5000, 10000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    binding.button3.setVisibility(VISIBLE);
                }

                @Override
                public void onFinish() {
                    UkryjPrzyciski();
                    binding.button2.setVisibility(VISIBLE);
                }
            };
            countDownTimer.start();
        }else{
            UkryjPrzyciski();
        }
    }

}