package com.kiaan.readwritetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    // declare java components
    private Button btnCategory;
    private EditText edtCatName;
    private EditText edtCateDesc;
    private EditText edtCatGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialise java components
        btnCategory = findViewById(R.id.btnAddCategory);
        edtCatName = findViewById(R.id.editTextCategoryName);
        edtCateDesc = findViewById(R.id.editTextDesc);
        edtCatGoal = findViewById(R.id.editTextGoal);

        btnCategory.setOnClickListener(view -> {

            // initialise variables
            String name = edtCatName.getText().toString();
            String desc = edtCateDesc.getText().toString();
            String goal = edtCatGoal.getText().toString();

            // instantiate Category obj
            Category cat = new Category(name, desc, goal);
/*
            DatabaseReference mDatabase;
            mDatabase = FirebaseDatabase.getInstance().getReference();

            mDatabase.child("Category").child(cat.getCategoryName()).setValue(cat);


 */
            // instantiate DbHandler obj
            DbHandler db = new DbHandler();

            // write object to database
             db.writeToFirebase("Category", cat.getCategoryName() , cat);

            // navigate to a new activity
            Intent intent = new Intent(MainActivity.this, ItemActivity.class);
            startActivity(intent);
        });

    }
}