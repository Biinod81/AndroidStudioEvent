package com.lythomas.eventapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int compteur = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }

    public void onClick(View v){
        TextView text = findViewById(R.id.textView2);
        Button b = (Button)v;
        text.setText(b.getText().toString());
    }

    public void onClickCompteur(View v){
        TextView text = findViewById(R.id.textView2);
        compteur++;
        text.setText(getResources().getString(R.string.Cliccc) + compteur);
    }
}
