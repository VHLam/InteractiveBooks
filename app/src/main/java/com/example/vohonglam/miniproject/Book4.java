package com.example.vohonglam.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Book4 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_4);
    }

    public void Clickd1 (View view) {
        Intent intent = new Intent(this, Intro4.class);
        startActivity(intent);
    }

    public void Clickd2 (View view) {
        Intent intent = new Intent(this, Skill4.class);
        startActivity(intent);
    }

    public void Clickd3 (View view) {
        Intent intent = new Intent(this, Item4.class);
        startActivity(intent);
    }

    public void Clickd4 (View view) {
        Intent intent = new Intent(this, Guide4.class);
        startActivity(intent);
    }

    public void Clickd5 (View view) {
        Intent intent = new Intent(this, Quiz4.class);
        startActivity(intent);
    }
}
