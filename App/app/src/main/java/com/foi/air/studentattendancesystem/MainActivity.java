package com.foi.air.studentattendancesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.foi.air.studentattendancesystem.R;
import com.foi.air.studentattendancesystem.uiprofesor.ListOfSeminars;

public class MainActivity extends AppCompatActivity {

    Button mBtnStudent;
    Button mBtnProfesor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnProfesor = findViewById(R.id.btnProfesor);
        mBtnProfesor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });
    }

}
