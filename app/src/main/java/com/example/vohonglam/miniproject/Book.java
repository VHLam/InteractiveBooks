package com.example.vohonglam.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Book extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_1);
    }

    public void Clicka1 (View view) {
        Intent intent = new Intent(this, Intro1.class);
        startActivity(intent);
    }

    public void Clicka2 (View view) {
        Intent intent = new Intent(this, Skill1.class);
        startActivity(intent);
    }

    public void Clicka3 (View view) {
        Intent intent = new Intent(this, Item1.class);
        startActivity(intent);
    }

    public void Clicka4 (View view) {
        Intent intent = new Intent(this, Guide1.class);
        startActivity(intent);
    }
    public void Clicka5 (View view) {
        Intent intent = new Intent(this, Quiz1.class);
        startActivity(intent);
    }
}
