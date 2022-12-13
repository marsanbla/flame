package com.example.p2sanmar;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void adddata(View view) {
        persistenciaprod per = new persistenciaprod();
       persistenciaprod.loadprod();

    }

    public void readprod(View view) {
        persistenciaprod read = new persistenciaprod();
        persistenciaprod.readprod();
    }
}