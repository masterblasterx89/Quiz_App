package com.qubixsolutions.quiz_app;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int numberCorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstPlayButton = this.findViewById(R.id.first_play_btn);
        final MediaPlayer firstPlayMP = MediaPlayer.create(this, R.raw.test_sound);
        firstPlayButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                firstPlayMP.start();
            }
        });

        Button secondPlayButton = this.findViewById(R.id.second_play_btn);
        final MediaPlayer secondPlayMP = MediaPlayer.create(this, R.raw.test_sound);
        secondPlayButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                secondPlayMP.start();
            }
        });

        Button thirdPlayButton = this.findViewById(R.id.third_play_btn);
        final MediaPlayer thirdPlayMP = MediaPlayer.create(this, R.raw.test_sound);
        thirdPlayButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                thirdPlayMP.start();
            }
        });

        Button forthPlayButton = this.findViewById(R.id.forth_play_btn);
        final MediaPlayer forthPlayMP = MediaPlayer.create(this, R.raw.test_sound);
        forthPlayButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                forthPlayMP.start();
            }
        });

        Button fifthPlayButton = this.findViewById(R.id.fifth_play_btn);
        final MediaPlayer fifthPlayMP = MediaPlayer.create(this, R.raw.test_sound);
        fifthPlayButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                fifthPlayMP.start();
            }
        });




    }

    public void submitQuiz (View view) {

        numberCorrect = 0;


        RadioButton getFirstAnswer = findViewById(R.id.first_answer1);


        EditText getSecondAnswer = findViewById(R.id.second_answer);
        String getSecondAnswerString = getSecondAnswer.getText().toString();

        CheckBox getThirdAnswer1 = findViewById(R.id.third_answer1);


        CheckBox getThirdAnswer2 = findViewById(R.id.third_answer2);


        RadioButton getForthAnswer = findViewById(R.id.forth_answer3);


        RadioButton getFifthAnswer = findViewById(R.id.fifth_answer3);


        if (getFirstAnswer.isChecked())
        {
            numberCorrect = numberCorrect + 1;
        }

        if (getSecondAnswerString.equals("Jim"))
        {
            numberCorrect = numberCorrect + 1;
        }

        if (getThirdAnswer1.isChecked() & getThirdAnswer2.isChecked())
        {
            numberCorrect = numberCorrect + 1;
        }

        if (getForthAnswer.isChecked())
        {
            numberCorrect = numberCorrect + 1;
        }

        if (getFifthAnswer.isChecked())
        {
            numberCorrect = numberCorrect + 1;
        }

        Toast.makeText(getApplicationContext(), "Number Correct " + numberCorrect + "/5.",Toast.LENGTH_LONG).show();


    }
}

