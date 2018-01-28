package com.example.bclan.tamuhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.view.MapView;

public class MainActivity extends AppCompatActivity {

    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        loginButton = (Button) findViewById(R.id.loginButton);


    }

    // when the user log's in they are redirected to the user type page
    public void loginButton(View view) {



        Intent i = new Intent(MainActivity.this, UserType.class);

        startActivity(i);


    }


}