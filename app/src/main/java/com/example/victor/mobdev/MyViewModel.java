package com.example.victor.mobdev;

import android.databinding.ObservableField;

import java.util.Observable;

/**
 * Created by victor on 04/12/2017.
 */

public class MyViewModel {
    public  final ObservableField<Integer> counter =new ObservableField<>();
    public ObservableField<String> buttonLabel = new ObservableField<>();
    public boolean enableIncrement;

    public MyViewModel(){
        buttonLabel.set("Increment");
        counter.set(0);
    }

    public void onClick(){

        enableIncrement=!enableIncrement;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (enableIncrement){
                    buttonLabel.set("Stop");
                    counter.set(counter.get()+1);
                    try { Thread.sleep(500); } catch (Exception e){}
                }
                buttonLabel.set("Increment!");
            }
        }).start();
    }
}
