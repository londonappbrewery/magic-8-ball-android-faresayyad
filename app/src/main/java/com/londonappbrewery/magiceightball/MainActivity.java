package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay= findViewById(R.id.iv_eightBall);

        final int[] ballArray=new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        Button askBtn=findViewById(R.id.btnAsk);

        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random numberGen =new Random();
                int number =numberGen.nextInt(5); // which is from 0 to 4
//                Log.d("Button", "Number is: "+ number);
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
