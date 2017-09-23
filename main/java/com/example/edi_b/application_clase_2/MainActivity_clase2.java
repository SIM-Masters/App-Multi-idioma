package com.example.edi_b.application_clase_2;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity_clase2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_clase2);
    }

    public void entrar2act2(View view){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
