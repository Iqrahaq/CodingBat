package uk.ac.northumbria.haq.iqra.week3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    static final int PICK_SCORE_REQUEST = 1; // The request code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

    }

    public void Accept_Clicked(View view){

        String user = username.getText().toString();
        String pass = password.getText().toString();

        Log.i("WEEK 3", "BUTTON CLICKED");
        Log.i("WEEK 3", "Username: " + username);
        Log.i("WEEK 3", "Password: " + password);

        Intent intent = new Intent(this, quizActivity.class);
        intent.putExtra("username", user);
        intent.putExtra("password", pass);
        startActivityForResult(intent, PICK_SCORE_REQUEST);
    }
}