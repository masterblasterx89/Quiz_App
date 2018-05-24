package com.qubixsolutions.quiz_app;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;



import org.w3c.dom.Text;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    int numberCorrect = 0;

    // Methods that play/grab the mps for the play buttons.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstPlayButton = this.findViewById(R.id.first_play_btn);
        final MediaPlayer firstPlayMP = MediaPlayer.create(this, R.raw.matchquestion1);
        firstPlayButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                firstPlayMP.start();
            }
        });

        Button secondPlayButton = this.findViewById(R.id.second_play_btn);
        final MediaPlayer secondPlayMP = MediaPlayer.create(this, R.raw.pilotquestion2);
        secondPlayButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                secondPlayMP.start();
            }
        });

        Button thirdPlayButton = this.findViewById(R.id.third_play_btn);
        final MediaPlayer thirdPlayMP = MediaPlayer.create(this, R.raw.mackquestion3);
        thirdPlayButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                thirdPlayMP.start();
            }
        });

        Button forthPlayButton = this.findViewById(R.id.forth_play_btn);
        final MediaPlayer forthPlayMP = MediaPlayer.create(this, R.raw.flobotsquestion4);
        forthPlayButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                forthPlayMP.start();
            }
        });

        Button fifthPlayButton = this.findViewById(R.id.fifth_play_btn);
        final MediaPlayer fifthPlayMP = MediaPlayer.create(this, R.raw.sailquestion5);
        fifthPlayButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                fifthPlayMP.start();
            }
        });


    }

    public void submitQuiz(View view) {

        numberCorrect = 0;

        //Grabbing what the user selected from the questions


        RadioButton getFirstAnswer = findViewById(R.id.first_answer1);
        RadioButton getFirstAnswer2 = findViewById(R.id.first_answer2);
        RadioButton getFirstAnswer3 = findViewById(R.id.first_answer3);
        RadioButton getFirstAnswer4 = findViewById(R.id.first_answer4);


        EditText getSecondAnswer = findViewById(R.id.second_answer);
        String getSecondAnswerString = getSecondAnswer.getText().toString();

        CheckBox getThirdAnswer1 = findViewById(R.id.third_answer1);
        CheckBox getThirdAnswer2 = findViewById(R.id.third_answer2);
        CheckBox getThirdAnswer3 = findViewById(R.id.third_answer3);
        CheckBox getThirdAnswer4 = findViewById(R.id.third_answer4);


        RadioButton getForthAnswer = findViewById(R.id.forth_answer4);


        RadioButton getFifthAnswer = findViewById(R.id.fifth_answer3);


        //Testing the users answer to the correct answer.


        if (getFirstAnswer.isChecked()) {
            numberCorrect = numberCorrect + 1;
        } else if (!getFirstAnswer.isChecked() && !getFirstAnswer2.isChecked() && !getFirstAnswer3.isChecked() && !getFirstAnswer4.isChecked()) {
            System.out.print("Didn't answer question 1");
        }

        if (getSecondAnswerString.equalsIgnoreCase("Ride")) {
            numberCorrect = numberCorrect + 1;
        }

        if (getThirdAnswer1.isChecked() & getThirdAnswer3.isChecked() & !getThirdAnswer2.isChecked() && !getThirdAnswer4.isChecked()) {
            numberCorrect = numberCorrect + 1;
        }

        if (getForthAnswer.isChecked()) {
            numberCorrect = numberCorrect + 1;
        }

        if (getFifthAnswer.isChecked()) {
            numberCorrect = numberCorrect + 1;
        }

        // Toast to display how many the user got correct.

        Toast.makeText(getApplicationContext(), "Number Correct " + numberCorrect + "/5.", Toast.LENGTH_SHORT).show();


    }
}

//"Copyright Disclaimer Under Section 107 of the Copyright Act 1976, allowance is made for "fair use"
// for purposes such as criticism, comment, news reporting, teaching, scholarship, and research.
// Fair use is a use permitted by copyright statute that might otherwise be infringing. Non-profit,
// educational or personal use tips the balance in favor of fair use."



