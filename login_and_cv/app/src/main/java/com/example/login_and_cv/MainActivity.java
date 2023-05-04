package com.example.login_and_cv;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView username = (TextView) findViewById(R.id.username);
       TextView password = (TextView) findViewById(R.id.password);
       password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
       MaterialButton loginbttn = (MaterialButton) findViewById(R.id.loginbttn);

       loginbttn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                   Toast.makeText(MainActivity.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                   Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                   startActivity(intent);
               } else {
                   Toast.makeText(MainActivity.this, "username or password is incorrect, try again", Toast.LENGTH_SHORT).show();
               }
           }
       });

    }
}