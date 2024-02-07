package com.example.egzamin1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public AppCompatButton polub, usun;
    public TextView polubienia;
    int licznik = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        polub = findViewById(R.id.polub);
        usun = findViewById(R.id.usun);
        polubienia = findViewById(R.id.polubienia);

        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(licznik-1 >= 0)
                {
                    licznik--;
                    String napis = licznik + " polubień";
                    polubienia.setText(napis);
                }
            }
        });
    }

    public void Polub(View view)
    {
        licznik++;
        String napis = licznik + " polubień";
        polubienia.setText(napis);
    }
}