package com.example.olivertagod;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olivertagod.LoginActivity;
import com.example.olivertagod.R;

public class WelcomeActivity extends AppCompatActivity {

    private TextView welcomeTextView;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomeTextView = findViewById(R.id.welcomeTextView);
        logoutButton = findViewById(R.id.logoutButton);

        // Display welcome message
        String welcomeMessage = "Welcome to my Android app\nUser";
        welcomeTextView.setText(welcomeMessage);

        // Logout button listener
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display logout message
                String logoutMessage = "You logged out";
                Toast.makeText(WelcomeActivity.this, logoutMessage, Toast.LENGTH_SHORT).show();

                // Go back to login activity
                Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
