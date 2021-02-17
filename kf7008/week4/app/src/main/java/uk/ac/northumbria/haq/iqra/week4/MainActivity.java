package uk.ac.northumbria.haq.iqra.week4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Joke aJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSecondScreen(View view){
        Intent go = new Intent(MainActivity.this, Second.class);
        startActivity(go);
    }
}