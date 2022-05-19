package com.kiaan.readwritetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class UserActivity extends AppCompatActivity {

    // declare java components
    private Button btnAddUser;
    private EditText edtName, edtSurname, edtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        // initialise variables
        btnAddUser = findViewById(R.id.btnUser);
        edtName = findViewById(R.id.editTextName);
        edtSurname = findViewById(R.id.editTextSurname);
        edtEmail = findViewById(R.id.editTextEmail);

        // instantiate DbHandler obj
        DbHandler db = new DbHandler();
        db.readFromFirebase();

        btnAddUser.setOnClickListener(view -> {

            // clear array list
            Global.lstStrings.clear();

            // declare variables
            String name, surname, email;

            // initialise variables
            name = edtName.getText().toString();
            surname = edtSurname.getText().toString();
            email = edtEmail.getText().toString();

            // instantiate User obj
            User user = new User(name, surname, email);

            db.readFromFirebase();

            // write object to database
            db.writeToFirebase("User", user.getName()+ user.getSurname(), user);


            // for test purposes
            Global.userID = user.getName() + user.getSurname();

            // navigate to a new activity
            Intent intent = new Intent(UserActivity.this, MainActivity.class);
            startActivity(intent);

        });
    }
}