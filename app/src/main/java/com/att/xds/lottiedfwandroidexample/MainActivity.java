package com.att.xds.lottiedfwandroidexample;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lottie Animation Example
        final LottieAnimationView animationViewExample = findViewById(R.id.animation_view_example);
        animationViewExample.setAnimation("example.json");
        animationViewExample.loop(false);
        animationViewExample.playAnimation();

        // handler
        final Handler handler = new Handler();

        animationViewExample.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                animationViewExample.setVisibility(View.INVISIBLE);
                animationViewExample.pauseAnimation();

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // wait to start animating after 3s
                        animationViewExample.setVisibility(View.VISIBLE);
                        animationViewExample.playAnimation();
                    }
                }, 3000);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // stay on last frame then animate after 3s
                        animationViewExample.playAnimation();
                    }
                }, 3000);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
    }
}
