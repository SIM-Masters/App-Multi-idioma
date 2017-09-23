package com.example.edi_b.application_clase_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrar2act1(View view){
        //Intent i= new Intent(this, MainActivity_clase2.class);
        //startActivity(i);
        finish();
    }
}
