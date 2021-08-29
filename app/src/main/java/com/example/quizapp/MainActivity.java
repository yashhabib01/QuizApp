package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quizapp.data.QuizObject;

public class MainActivity extends AppCompatActivity {

    private TextView ques;
    private AppCompatButton opt1, opt2, opt3, opt4,correct_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ques = findViewById(R.id.question);
        opt1 = findViewById(R.id.opt1);
        opt2 = findViewById(R.id.opt2);
        opt3 = findViewById(R.id.opt3);
        opt4 = findViewById(R.id.opt4);

        // 0
        // 3

        String question = "Capital of India";
        String arr[] = {"Mumbai", "Nagpur", "Kolhapur", "Delhi"};
        int ans = 3;
        QuizObject quizObject = new QuizObject(question, arr, ans);

        setData(quizObject);

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int curAns = Integer.parseInt(view.getTag().toString());
                if (curAns == ans) {
                    Toast.makeText(MainActivity.this, "Right Answer", Toast.LENGTH_SHORT).show();
                    opt1.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));

                } else {
                    if(Integer.parseInt(opt2.getTag().toString()) == ans){
                        opt2.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                    }else if(Integer.parseInt(opt3.getTag().toString()) == ans){
                        opt3.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                    }else if(Integer.parseInt(opt4.getTag().toString()) == ans){
                        opt4.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                    }

                    opt1.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.red));

                    Toast.makeText(MainActivity.this, "WrongAnswer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int curAns = Integer.parseInt(view.getTag().toString());
                if (curAns == ans) {
                    Toast.makeText(MainActivity.this, "Right Answer", Toast.LENGTH_SHORT).show();
                    opt2.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));

                } else {
                   if(Integer.parseInt(opt1.getTag().toString()) == ans){
                     opt1.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                   }else if(Integer.parseInt(opt3.getTag().toString()) == ans){
                       opt3.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                   }else if(Integer.parseInt(opt4.getTag().toString()) == ans){
                       opt4.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                   }

                    opt2.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.red));

                    Toast.makeText(MainActivity.this, "WrongAnswer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int curAns = Integer.parseInt(view.getTag().toString());
                if (curAns == ans) {
                    Toast.makeText(MainActivity.this, "Right Answer", Toast.LENGTH_SHORT).show();
                    opt3.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));

                } else {
                    if(Integer.parseInt(opt1.getTag().toString()) == ans){
                        opt1.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                    }else if(Integer.parseInt(opt3.getTag().toString()) == ans){
                        opt2.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                    }else if(Integer.parseInt(opt4.getTag().toString()) == ans){
                        opt4.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                    }

                    opt3.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.red));

                    Toast.makeText(MainActivity.this, "WrongAnswer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int curAns = Integer.parseInt(view.getTag().toString());
                if (curAns == ans) {
                    Toast.makeText(MainActivity.this, "Right Answer", Toast.LENGTH_SHORT).show();
                    opt4.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));

                } else {
                    if(Integer.parseInt(opt1.getTag().toString()) == ans){
                        opt1.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                    }else if(Integer.parseInt(opt3.getTag().toString()) == ans){
                        opt3.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                    }else if(Integer.parseInt(opt4.getTag().toString()) == ans){
                        opt2.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.colorPrimary));
                    }

                    opt4.setBackgroundTintList(MainActivity.this.getResources().getColorStateList(R.color.red));

                    Toast.makeText(MainActivity.this, "WrongAnswer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void setData(QuizObject quizObject) {
        opt1.setText(quizObject.getOptions()[0]);
        opt2.setText(quizObject.getOptions()[1]);
        opt3.setText(quizObject.getOptions()[2]);
        opt4.setText(quizObject.getOptions()[3]);
        ques.setText(quizObject.getQuestion());
    }
}