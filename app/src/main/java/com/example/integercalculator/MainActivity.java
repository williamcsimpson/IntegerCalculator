package com.example.integercalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Constants for program
    private static final int BUTTON_0_VAL = 0;

    //String that holds what is currently displayed
    private String displayContent = "0";

    //Stores first operand
    private int  operand1 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when user presses button0
     *
     * @param view used for something idk...
     */
    public void button0Pressed( View view ) {

    }
}
