package uk.ac.northumbria.haq.iqra.week3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class quizActivity extends AppCompatActivity {

    String user, pass;
    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        question = (TextView) findViewById(R.id.question);
        Intent intent = getIntent();
        user = intent.getStringExtra("username");
        pass = intent.getStringExtra("password");
        if(user != null){
            question.setText("Hello Again: " + user);
        }
    }

    public void Finish_Clicked(View view){
        Log.i("WEEK 3", "FINISH CLICKED!");
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", 180);
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}