package uk.ac.northumbria.haq.iqra.week4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Second extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        // assert rg != null;
        rg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId){
        switch(checkedId) {
            case R.id.radioButton1:
                result = 1;
                break;
            case R.id.radioButton2:
                result = 2;
                break;
            case R.id.radioButton3:
                result = 3;
                break;
            case R.id.radioButton4:
                result = 4;
                break;
            // default assert false
        }
        Log.i("WEEK 4", "Radio Button: " + result);
    }

    public void onClick(View view){

    }

    public void goNext(View view){

    }

    public void checkAnswer(View view){

    }



}