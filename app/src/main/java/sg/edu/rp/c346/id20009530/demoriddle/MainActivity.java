package sg.edu.rp.c346.id20009530.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Event handling step1
    Button btnRevealQ1;
    TextView tvQ1;

    Button btnRevealQ2;
    TextView tvQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // event handling step2
        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.btnRevealQ1);

        //event handling step3
        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question","Q1");
                startActivity(intent);
            }

        });

        tvQ2 = findViewById(R.id.textViewQ2);
        btnRevealQ2 = findViewById(R.id.btnRevealQ2);


        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity2.class);
                intent.putExtra("Question2","Q2");
                startActivity(intent);
            }
        });



    }
}