package com.example.victor.mobdev;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.victor.mobdev.databinding.ActivityMiddelBinding;

/**
 * Created by victor on 02/01/2018.
 */

public class AcivityMiddelView  extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("seconde activity");
        //(() DataBindingUtil.setContentView(this,R.layout.activity_main2)).setViewModel(new MyViewModel());
        ((ActivityMiddelBinding) DataBindingUtil.setContentView(this,R.layout.activity_main2)).setViewModel(new MyViewModel());
    }
}
