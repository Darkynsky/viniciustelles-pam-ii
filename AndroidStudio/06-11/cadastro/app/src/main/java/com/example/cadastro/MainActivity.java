package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DatabaseReference alunos = minhaReferencia.child("alunos");
        Alunos a = new Alunos();


    }
}