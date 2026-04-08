
package com.example.pizzadelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListView menuList = findViewById(R.id.menu_list);

        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Margherita - $12.99");
        menuItems.add("Pepperoni - $14.99");
        menuItems.add("Vegetarian - $13.99");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, menuItems);
        menuList.setAdapter(adapter);

        Button placeOrderButton = findViewById(R.id.place_order_button);
        placeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, OrderActivity.class);
                startActivity(intent);
            }
        });
    }
}
