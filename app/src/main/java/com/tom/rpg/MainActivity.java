package com.tom.rpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();

    }

    private void findviews() {
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.arrow_down:
                Log.d("MainActivity", "OnClick:button_DOWN");
                break;

            case R.id.arrow_up:
                Log.d("MainActivity", "OnClick:button_UP");
                break;

            case R.id.arrow_right:
                Log.d("MainActivity", "OnClick:button_RIGHT");
                break;

            case R.id.arrow_left:
                Log.d("MainActivity", "OnClick:button_LEFT");
                break;
        }
    }
}

