package com.agik_button_swipe;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.agik.swipe_button.Controller.OnSwipeCompleteListener;
import com.agik.swipe_button.View.Swipe_Button_View;

public class Swipe_Button_Sample extends AppCompatActivity {
    private Swipe_Button_View start,stop,start_stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_button_sample);
        stop = findViewById(R.id.stop);
        start = findViewById(R.id.start);
        start_stop = findViewById(R.id.start_stop);
        start.setOnSwipeCompleteListener_forward_reverse(new OnSwipeCompleteListener() {
            @Override
            public void onSwipe_Forward(Swipe_Button_View swipeView) {

            }

            @Override
            public void onSwipe_Reverse(Swipe_Button_View swipeView) {

            }
        });
        stop.setOnSwipeCompleteListener_forward_reverse(new OnSwipeCompleteListener() {
            @Override
            public void onSwipe_Forward(Swipe_Button_View swipeView) {

            }

            @Override
            public void onSwipe_Reverse(Swipe_Button_View swipeView) {

            }
        });

        start_stop.setOnSwipeCompleteListener_forward_reverse(new OnSwipeCompleteListener() {
            @Override
            public void onSwipe_Forward(Swipe_Button_View swipeView) {
                start_stop.setText("Stop");
                start_stop.setThumbBackgroundColor(ContextCompat.getColor(Swipe_Button_Sample.this, R.color.red));
                start_stop.setSwipeBackgroundColor(ContextCompat.getColor(Swipe_Button_Sample.this, R.color.red));
            }

            @Override
            public void onSwipe_Reverse(Swipe_Button_View swipeView) {
                start_stop.setText("Start");
                start_stop.setThumbBackgroundColor(ContextCompat.getColor(Swipe_Button_Sample.this, R.color.green));
                start_stop.setSwipeBackgroundColor(ContextCompat.getColor(Swipe_Button_Sample.this, R.color.green));
            }
        });
    }
}
