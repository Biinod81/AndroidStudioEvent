package com.lythomas.eventapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int compteur = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }

    public void onClickTEST(View v){
        TextView text = findViewById(R.id.textView2);
        EditText op1 = findViewById(R.id.operande1);
        EditText op2 = findViewById(R.id.operande2);
        Button b = (Button)v;
        if (b.getText().toString()=="+"){
            Toast.makeText(getApplicationContext(),"Addition",Toast.LENGTH_SHORT).show();
            int res = Integer.parseInt(op1.getText().toString()) + Integer.parseInt(op2.getText().toString());
            text.setText(res);
        }
    }

    public void onClick(View v){
        int res = 0;
        TextView text = findViewById(R.id.textView2);
        EditText op1 = findViewById(R.id.operande1);
        EditText op2 = findViewById(R.id.operande2);
        Button b = (Button)v;
        switch (b.getId()){
            case R.id.b1 :
                res = Integer.parseInt(op1.getText().toString()) + Integer.parseInt(op2.getText().toString());;
                text.setText("Résultat = "+res);
                break;
            case R.id.b2 :
                res = Integer.parseInt(op1.getText().toString()) - Integer.parseInt(op2.getText().toString());
                text.setText("Résultat = "+res);
                break;
            case R.id.b3 :
                if (op2.getText().toString()=="0"){
                    text.setText("Résultat = +/- infini");
                    break;
                }
                //res = Integer.parseInt(op1.getText().toString()) / Integer.parseInt(op2.getText().toString());
                //text.setText("Résultat = "+res);
                break;
            case R.id.b4 :
                res = Integer.parseInt(op1.getText().toString()) * Integer.parseInt(op2.getText().toString());
                text.setText("Résultat = "+res);
                break;
        }
    }

    public void onClickCompteur(View v){
        TextView text = findViewById(R.id.textView2);
        compteur++;
        text.setText(getResources().getString(R.string.Cliccc) + compteur);
    }
}
