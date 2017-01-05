package com.team16.register;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.step_1);
    }

    public void verifyEmail(View v) {
        setContentView(R.layout.step_1_success);
        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                setContentView(R.layout.step_2);
            }

        }.start();
    }

    public void verifyPhoneNumber(View v) {
        setContentView(R.layout.step_2_success);
        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                setContentView(R.layout.step_3);
            }

        }.start();
    }
    public void verifyPassword(View v) {
        setContentView(R.layout.step_3_success);
    }
}
