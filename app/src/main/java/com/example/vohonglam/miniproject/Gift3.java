package com.example.vohonglam.miniproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Gift3 extends Activity {

    private MediaPlayer player;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gift_3);
        player = MediaPlayer.create(this, R.raw.a);
        player.start();
    }

    public void Clickreturn3 (View view) {
        player.stop();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
