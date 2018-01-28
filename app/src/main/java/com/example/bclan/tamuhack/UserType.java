package com.example.bclan.tamuhack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by ledet awano on 1/28/2018.
 */

public class UserType extends AppCompatActivity {

    Button buttonToMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_type_layout);

        buttonToMaps = (Button) findViewById(R.id.buttonToMaps);

    }

    public void buttonToMaps(View view) {

        Intent i = new Intent(UserType.this, MapsPage.class);

        startActivity(i);


    }

}
