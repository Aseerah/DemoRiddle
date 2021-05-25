package sg.edu.rp.c346.id20009530.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer; // create new variable for the new page


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);
//        tvAnswer.setText("In Second Activity");

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        tvAnswer.setText(questionsSelected+ " answer is: Queue");


    }
}