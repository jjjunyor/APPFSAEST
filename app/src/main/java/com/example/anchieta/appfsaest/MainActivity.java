package com.example.anchieta.appfsaest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

private DatabaseReference firebaseDatabase=FirebaseDatabase.getInstance().getReference();

    @Override
    public void finishAndRemoveTask() {
        super.finishAndRemoveTask();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Usuario user=new Usuario("Marcos Brito","M",9);
        Produto prod=new Produto(01,"Saboteste","Peso");

        setContentView(R.layout.activity_main);
        firebaseDatabase.child("pontos").setValue("100");
        //firebaseDatabase.child("users").child("123").child("username").setValue("maria");
        firebaseDatabase.child("User").setValue(user);
        firebaseDatabase.child("Produto").setValue(user);


    }
}
