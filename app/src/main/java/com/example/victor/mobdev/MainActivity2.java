package com.example.victor.mobdev;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.victor.mobdev.databinding.ActivityMain2Binding;
import com.example.victor.mobdev.databinding.ActivityMiddelBinding;

import java.util.ArrayList;


/**
 * Created by victor on 04/12/2017.
 */

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        /*MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.contactList.setLayoutManager(layoutManager);*/


        /* data filling */

        /*Adapter adapter = new Adapter(this);
        binding.contactList.setAdapter(adapter);**/

        ((ActivityMain2Binding) DataBindingUtil.setContentView(this, R.layout.activity_main2)).setViewModel(new MyViewModel());
        System.out.println("main activity");
       /* final Button loginButton = (Button) findViewById(R.id.chage);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, AcivityMiddelView.class);
                startActivity(intent);
            }
        });*/
    }
}
