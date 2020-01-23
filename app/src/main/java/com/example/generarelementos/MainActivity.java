package com.example.generarelementos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private int contador = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout layoutScroll = (LinearLayout) findViewById(R.id.layoutScroll);
        Button buttonCrearBoton = (Button) findViewById(R.id.buttonCrearBoton);

        buttonCrearBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button nuevoboton = new Button(MainActivity.this);
                nuevoboton.setText("BOTON "+String.valueOf(contador++));
                layoutScroll.addView(nuevoboton);
                nuevoboton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        layoutScroll.removeView(view);
                    }
                });
            }
        });
    }
}