package com.example.victor.mobdev;

import android.os.Bundle;

import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    public int counter;
    public boolean enableIncrement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) this.findViewById(R.id.counter)).setText(String.valueOf(counter));
        ((Button)this.findViewById(R.id.button)).setText("increment!");
    }

    public void onClick(View v){
        enableIncrement=!enableIncrement;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (enableIncrement){

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            ((Button)findViewById(R.id.button)).setText("stop");
                        }
                    });

                    counter++;

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            ((TextView)findViewById(R.id.counter)).setText(String.valueOf(counter));
                        }
                    });
                    try { Thread.sleep(500); }catch (Exception e) {}
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        ((Button)findViewById(R.id.button)).setText("Increment!");
                    }
                });
            }
        }).start();

    }

}