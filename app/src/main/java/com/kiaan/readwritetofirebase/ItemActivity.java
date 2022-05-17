package com.kiaan.readwritetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ItemActivity extends AppCompatActivity {

    // declare java components
    private Button btnItem;
    private EditText edtItemName, edtItemDesc, edtItemCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);


        // initialise java componenets
        btnItem = findViewById(R.id.btnAddItem);
        edtItemName = findViewById(R.id.editTextItemName);
        edtItemDesc = findViewById(R.id.editTextItemDescription);
        edtItemCategory = findViewById(R.id.editTextSelectCategory);

        btnItem.setOnClickListener(view -> {

            // initialise variables
            String name = edtItemName.getText().toString();
            String desc = edtItemDesc.getText().toString();
            String pickCat = edtItemCategory.getText().toString();

            // instantiate item object
            Item item = new Item(name, desc, pickCat);

            // instantiate DbHandler obj
            DbHandler db = new DbHandler();

            // write object to database
            db.writeToFirebase("User",Global.userID,"Category", Global.category, "Item", item.getItemName(), item);

            // assign category to test
            Global.item = item.getItemName();

            // navigate to a new activity
            Intent intent = new Intent(ItemActivity.this, MainActivity.class);
            startActivity(intent);

        });

    }
}