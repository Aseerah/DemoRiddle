package sg.edu.rp.c346.id20009530.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer2 = findViewById(R.id.textView2);


//        tvAnswer2.setText("Ans for qn 2");

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question2");
        tvAnswer2.setText(questionsSelected+ " answer is: Gone");




    }
}