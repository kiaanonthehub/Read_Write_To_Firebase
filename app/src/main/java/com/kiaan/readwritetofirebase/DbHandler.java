package com.kiaan.readwritetofirebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public  class DbHandler {

    private DatabaseReference mDatabase;

    // method to write object to real time database
    public void writeToFirebase(String tableName, String uID, Object obj) {

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child(tableName).child(uID).setValue(obj);

        System.out.println("Successful");
    }


    // overload method to write nested child object to real time database
    public void writeToFirebase(String tableName, String uID, String tableName2, String uID2, Object obj) {

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child(tableName).child(uID).child(tableName2).child(uID2).setValue(obj);
    }



}
