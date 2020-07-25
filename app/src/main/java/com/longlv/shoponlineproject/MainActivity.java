package com.longlv.shoponlineproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button joinNowBtn, loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intWidget();
    }

    private void intWidget() {
        joinNowBtn = (Button) findViewById(R.id.main_join_btn);
        loginBtn = (Button) findViewById(R.id.main_login_btn);
    }
}