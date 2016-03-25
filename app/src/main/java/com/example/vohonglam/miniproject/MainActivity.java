package com.example.vohonglam.miniproject;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ViewFlipper;


public class MainActivity extends Activity
{
    private ViewFlipper viewFlipper;
    private float lastX;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) findViewById(R.id.view_flipper);
    }



    public boolean onTouchEvent(MotionEvent touchevent)
    {
        switch (touchevent.getAction())
        {
            case MotionEvent.ACTION_DOWN:
            {
                lastX = touchevent.getX();
                break;
            }
            case MotionEvent.ACTION_UP:
            {
                float currentX = touchevent.getX();

                if (lastX < currentX)
                {
                    if (viewFlipper.getDisplayedChild() == 0)
                        break;

                    viewFlipper.setInAnimation(this, R.anim.in_from_left);
                    viewFlipper.setOutAnimation(this, R.anim.out_to_right);
                    viewFlipper.showNext();
                }

                if (lastX > currentX)
                {
                    if (viewFlipper.getDisplayedChild() == 1)
                        break;
                    viewFlipper.setInAnimation(this, R.anim.in_from_right);
                    viewFlipper.setOutAnimation(this, R.anim.out_to_left);
                    viewFlipper.showPrevious();
                }
                break;
            }
        }
        return false;
    }

    public void Click1 (View view) {
        Intent intent = new Intent(this, Book.class);
        startActivity(intent);
    }

    public void Click2 (View view) {
        Intent intent = new Intent(this, Book2.class);
        startActivity(intent);
    }

    public void Click3 (View view) {
        Intent intent = new Intent(this, Book3.class);
        startActivity(intent);
    }

    public void Click4 (View view) {
        Intent intent = new Intent(this, Book4.class);
        startActivity(intent);
    }

    public void Click5 (View view) {
        Intent intent = new Intent(this, Book5.class);
        startActivity(intent);
    }

}
