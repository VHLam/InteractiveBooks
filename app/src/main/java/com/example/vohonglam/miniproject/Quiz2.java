package com.example.vohonglam.miniproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by VO HONG LAM on 30/06/2015.
 */
public class Quiz2 extends Activity {

    public int score = 0;
    int count = 0;
    private static final String[] Q1 = {
            "What is the name of hero in this book?","Rylai","Lina","Traxex","Lyralei"
    };
    private static final String[] Q2 = {
            "How long the max success stun duration of Shacklesshot is?","3","3.25","3.5","3.75"
    };
    private static final String[] Q3 = {
            "What is the name of her ultimate skill?","Shacklesshot","Powershot","Focus Fire","Windrun"
    };
    RadioButton rda, rdb, rdc, rdd;
    TextView tv;
    TextView tv2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_1);
        rda = (RadioButton)findViewById(R.id.radioButton);
        rdb = (RadioButton)findViewById(R.id.radioButton2);
        rdc = (RadioButton)findViewById(R.id.radioButton3);
        rdd = (RadioButton)findViewById(R.id.radioButton4);
        tv = (TextView) findViewById(R.id.ques1);
        tv.setText(Q1[0]);
        rda.setText(Q1[1]);
        rdb.setText(Q1[2]);
        rdc.setText(Q1[3]);
        rdd.setText(Q1[4]);
        tv2 = (TextView) findViewById(R.id.score1);
        tv2.setText("YOUR SCORE: " + score);
    }

    public void Question() {
        if (count == 1)
        {
            tv.setText(Q2[0]);
            rda.setText(Q2[1]);
            rdb.setText(Q2[2]);
            rdc.setText(Q2[3]);
            rdd.setText(Q2[4]);
            tv2.setText("YOUR SCORE: " + score);
        }
        if (count == 2)
        {
            tv.setText(Q3[0]);
            rda.setText(Q3[1]);
            rdb.setText(Q3[2]);
            rdc.setText(Q3[3]);
            rdd.setText(Q3[4]);
            tv2.setText("YOUR SCORE: " + score);
        }
        if (count == 3)
        {
            if (score == 0) {
                Intent intent = new Intent(this, Gift1.class);
                startActivity(intent);
            }
            else if (score == 3)
            {
                Intent intent = new Intent(this, Gift3.class);
                startActivity(intent);
            }
            else {
                Intent intent = new Intent(this, Gift2.class);
                startActivity(intent);
            }
        }
    }


    public void Clicknext1 (View view) {
        if (count == 0)
        {
            RadioGroup group = (RadioGroup) findViewById(R.id.radioGroup1);
            int checkedID = group.getCheckedRadioButtonId();
            if (checkedID == R.id.radioButton4)
            {
                score++;
            }
        }
        if (count == 1)
        {
            RadioGroup group = (RadioGroup) findViewById(R.id.radioGroup1);
            int checkedID = group.getCheckedRadioButtonId();
            if (checkedID == R.id.radioButton4)
            {
                score++;
            }
        }
        if (count == 2)
        {
            RadioGroup group = (RadioGroup) findViewById(R.id.radioGroup1);
            int checkedID = group.getCheckedRadioButtonId();
            if (checkedID == R.id.radioButton3)
            {
                score++;
            }

        }
        count++;
        Question();
    }
}
