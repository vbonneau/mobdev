package com.example.victor.mobdev;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



/**
 * Created by victor on 04/12/2017.
 */

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);

        //((ActivityMain2Binding) DataBindingUtil.setContentView(this,R.layout.activity_main2)).setViewModel(new MyViewModel());
    }
}
