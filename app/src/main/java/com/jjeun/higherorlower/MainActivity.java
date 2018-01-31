package com.jjeun.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.jjeun.higherorlower.randomnum;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    randomnum rNum = new randomnum();

    public void guessNumber(View view){

        EditText guess = (EditText) findViewById(R.id.guessEditText);
        int guessNumber = Integer.parseInt(guess.getText().toString());
        int randomNumber = rNum.getRandomNumber();

        if(randomNumber == guessNumber){
            Toast.makeText(MainActivity.this, "You guessed right! Play again!", Toast.LENGTH_LONG).show();
            rNum.setRandomNumber();
        }
        else if (randomNumber < guessNumber) {
            Toast.makeText(MainActivity.this, "Sorry wrong guess! Try guessing LOWER!", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(MainActivity.this, "Sorry wrong guess! Try guessing HIGHER!", Toast.LENGTH_LONG).show();
        }
     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
