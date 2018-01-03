package com.example.victor.mobdev;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.victor.mobdev.databinding.ActivityMiddelBinding;

/**
 * Created by victor on 02/01/2018.
 */

public class AcivityMiddelView  extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("seconde activity");

        ((ActivityMiddelBinding) DataBindingUtil.setContentView(this,R.layout.activity_middel)).setViewModel(new MyViewModel(this));

        Button addButton = (Button) findViewById(R.id.retourAdd);
        addButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent apell = new Intent(AcivityMiddelView.this,MainActivity2.class);
                startActivity(apell);
            }
        });
    }
}
