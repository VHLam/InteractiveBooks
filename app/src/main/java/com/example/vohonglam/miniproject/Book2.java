package com.example.vohonglam.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Book2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_2);
    }

    public void Clickb1 (View view) {
        Intent intent = new Intent(this, Intro2.class);
        startActivity(intent);
    }

    public void Clickb2 (View view) {
        Intent intent = new Intent(this, Skill2.class);
        startActivity(intent);
    }

    public void Clickb3 (View view) {
        Intent intent = new Intent(this, Item2.class);
        startActivity(intent);
    }

    public void Clickb4 (View view) {
        Intent intent = new Intent(this, Guide2.class);
        startActivity(intent);
    }

    public void Clickb5 (View view) {
        Intent intent = new Intent(this, Quiz2.class);
        startActivity(intent);
    }
}
