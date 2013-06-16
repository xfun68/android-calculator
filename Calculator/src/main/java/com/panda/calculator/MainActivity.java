package com.panda.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void calculate(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstOperand);
        EditText secondNumber = (EditText) findViewById(R.id.secondOperand);

        Integer result = Integer.parseInt(firstNumber.getText().toString()) + Integer.parseInt(secondNumber.getText().toString());

        TextView sum = (TextView) findViewById(R.id.sum);
        sum.setText(result.toString());
    }
    
}
