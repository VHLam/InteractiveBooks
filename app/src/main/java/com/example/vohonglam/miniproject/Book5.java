package com.example.vohonglam.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Book5 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_5);
    }

    public void Clicke1 (View view) {
        Intent intent = new Intent(this, Intro5.class);
        startActivity(intent);
    }

    public void Clicke2 (View view) {
        Intent intent = new Intent(this, Skill5.class);
        startActivity(intent);
    }

    public void Clicke3 (View view) {
        Intent intent = new Intent(this, Item5.class);
        startActivity(intent);
    }

    public void Clicke4 (View view) {
        Intent intent = new Intent(this, Guide5.class);
        startActivity(intent);
    }

    public void Clicke5 (View view) {
        Intent intent = new Intent(this, Quiz5.class);
        startActivity(intent);
    }
}
