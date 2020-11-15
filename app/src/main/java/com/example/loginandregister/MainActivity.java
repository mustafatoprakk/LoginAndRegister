package com.example.loginandregister;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLogin=findViewById(R.id.tvForgot);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void registerOnClick(View view){
        Intent intent=new Intent(MainActivity.this, Register.class);
        Pair[] pairs=new Pair[1];
        pairs[0]=new Pair<View, String>(tvLogin, "tvLogin");
        ActivityOptions activityOptions=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
        startActivity(intent);
    }
}