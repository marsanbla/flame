package com.example.p2sanmar;

import static android.content.ContentValues.TAG;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class persistenciaprod {

    static FirebaseFirestore db = FirebaseFirestore.getInstance();

    public static void loadprod() {
        CollectionReference prods = db.collection("prods");

        Map<String, Object> data1 = new HashMap<>();
        data1.put("desc", "Mesa ");

        prods.document("M01").set(data1);

        Map<String, Object> data2 = new HashMap<>();
        data2.put("desc", "Sofa");

        prods.document("M02").set(data2);

        Map<String, Object> data3 = new HashMap<>();
        data3.put("desc", "Silla");

        prods.document("m03").set(data3);

        Map<String, Object> data4 = new HashMap<>();
        data4.put("desc", "Sillon");

        prods.document("M04").set(data4);

        Map<String, Object> data5 = new HashMap<>();
        data5.put("desc", "Estanteria");

        prods.document("M05").set(data5);
    }

    public static void readprod() {
        db.collection("prods")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                            }
                        } else {
                            Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }


                });
    }
}