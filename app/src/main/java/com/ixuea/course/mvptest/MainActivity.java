package com.ixuea.course.mvptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ixuea.course.mvptest.login.LoginActivity;
import com.ixuea.course.mvptest.register.RegisterActivity;
import com.ixuea.course.mvptest.splash.SplashActivity;

public class MainActivity extends AppCompatActivity  {

    private Button btSplash;
    private Button btLogin;
    private Button btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSplash=findViewById(R.id.bt_splash);
        btLogin=findViewById(R.id.bt_login);
        btRegister=findViewById(R.id.bt_register);

        btSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SplashActivity.class));
            }
        });

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });
    }

}
