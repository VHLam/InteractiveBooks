package com.example.vohonglam.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Book3 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_3);
    }

    public void Clickc1 (View view) {
        Intent intent = new Intent(this, Intro3.class);
        startActivity(intent);
    }

    public void Clickc2 (View view) {
        Intent intent = new Intent(this, Skill3.class);
        startActivity(intent);
    }

    public void Clickc3 (View view) {
        Intent intent = new Intent(this, Item3.class);
        startActivity(intent);
    }

    public void Clickc4 (View view) {
        Intent intent = new Intent(this, Guide3.class);
        startActivity(intent);
    }

    public void Clickc5 (View view) {
        Intent intent = new Intent(this, Quiz3.class);
        startActivity(intent);
    }
}
