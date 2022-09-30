package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, name, email, password, confirmpassword;
    androidx.appcompat.widget.AppCompatButton signup, signin;
    DBHelper DB;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        username=findViewById(R.id.username);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        confirmpassword=findViewById(R.id.confirmpassword);

        signup=findViewById(R.id.signup);
        signin=findViewById(R.id.signin);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String nm = name.getText().toString();
                String pass = password.getText().toString();
                String cpass = confirmpassword.getText().toString();
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}