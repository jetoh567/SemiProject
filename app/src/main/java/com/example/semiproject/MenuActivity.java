package com.example.semiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    List<MyMenu> menus = new ArrayList<>();
    ListView menuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menuView = findViewById(R.id.menuView);


    }
}
