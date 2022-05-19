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

            // instantiate DbHandler obj
            DbHandler db = new DbHandler();

            // write object to database
            db.writeToFirebase("User",Global.userID,"Category", cat.getCategoryName(), cat);

            // assign category to test
            Global.category = cat.getCategoryName();

            // navigate to a new activity
            Intent intent = new Intent(MainActivity.this, ItemActivity.class);
            startActivity(intent);
        });

    }
}