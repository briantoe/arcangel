package com.example.bclan.tamuhack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by ledet awano on 1/28/2018.
 */

public class UserType extends AppCompatActivity {

    private Button buttonToMaps;
    private RadioGroup radioGroup;
    private int selectedId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_type_layout);

        onSelectUsetType();

    }
    private void onSelectUsetType() {

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        selectedId = radioGroup.getCheckedRadioButtonId();
        buttonToMaps = (Button) findViewById(R.id.buttonToMaps);
        buttonToMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedId == 0 || selectedId == 1) {
                    Intent emtOrParamedics = new Intent(UserType.this, EmtOrParaMap.class );

                } else if (selectedId == 1) {
                    Intent volunteerActivity = new Intent(UserType.this, MapsPage.class );
                    startActivity(volunteerActivity);
                }
            }
        });


         }





}
