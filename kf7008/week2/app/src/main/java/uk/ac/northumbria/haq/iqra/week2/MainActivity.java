package uk.ac.northumbria.haq.iqra.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }

    public void Accept_Clicked(View view){
        Log.i("WEEK2", "BUTTON CLICKED!!!");
        Log.i("WEEK2", "USERNAME: " + username.getText().toString());
        Log.i("WEEK2", "PASSWORD: " + password.getText().toString());
    }
}