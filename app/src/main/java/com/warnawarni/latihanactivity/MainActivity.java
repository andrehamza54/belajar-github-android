package com.warnawarni.latihanactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
// deklarasi komponen
    Button btnClose, btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClose = (Button) findViewById(R.id.btn_close);
        btnStart = (Button) findViewById(R.id.btn_start_activity);

        btnClose.setOnClickListener(this);
        btnStart.setOnClickListener(this);

        Toast.makeText(this, "Activity:on Create", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"Activity:onStart", Toast.LENGTH_SHORT).show();
    }
}