package com.example.vohonglam.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Gift2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gift_2);
    }

    public void Clickreturn2 (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
