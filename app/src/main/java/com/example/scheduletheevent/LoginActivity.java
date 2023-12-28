package com.example.scheduletheevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button button;
    TextView txtsignup, txtadminsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.btn_login);
        txtsignup = findViewById(R.id.txt_signup);
        txtadminsignup = findViewById(R.id.txt_adminsignup);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, UserDashboardActivity.class);
            startActivity(intent);
            finish();
        });

        txtsignup.setOnClickListener(view -> {
            Intent intent = new Intent(this, SignupActivity.class);
            startActivity(intent);
            finish();
        });
        txtadminsignup.setOnClickListener(view -> {
            Intent intent = new Intent(this, AdminSignupActivity.class);
            startActivity(intent);
            finish();
        });
    }
}