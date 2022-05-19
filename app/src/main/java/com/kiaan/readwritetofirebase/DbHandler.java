package com.kiaan.readwritetofirebase;

import android.util.Log;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class DbHandler {

    private DatabaseReference mDatabase;

    // method to write object to real time database
    public void writeToFirebase(String tableName, String uID, Object obj) {

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child(tableName).child(uID).setValue(obj);
    }


    // overload method to write nested child object to real time database
    public void writeToFirebase(String tableName, String uID, String tableName2, String uID2, Object obj) {

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child(tableName).child(uID).child(tableName2).child(uID2).setValue(obj);
    }


    // overload method to write nested child object to real time database
    public void writeToFirebase(String tableName, String uID, String tableName2, String uID2, String tableName3, String uID3, Object obj) {

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child(tableName).child(uID).child(tableName2).child(uID2).child(tableName3).child(uID3).setValue(obj);
    }


    public void readFromFirebase() {

        DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
        DatabaseReference categoryRef = rootRef.child("User").child("KiaanMaharaj").child("Category");

        categoryRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Global.lstStrings.clear();
                for (DataSnapshot d : snapshot.getChildren()) {
                    Global.lstStrings.add(d.getKey());
                }

/*                for (int i =0; i<Global.lstStrings.size();i++)
                {
                    System.out.println(Global.lstStrings.get(i));
                }*/
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }
}
