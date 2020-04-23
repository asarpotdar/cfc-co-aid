package com.example.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity  {
    private Button button;
    private Button loginbutton;
    private EditText username;
    private String uid="ABC";
    private AppCompatAutoCompleteTextView autoTextViewCustom;
    private android.widget.EditText edtPassword;
    private AppCompatCheckBox checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Open registration Activity
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationPage();
            }

        });

        // Open Main Activity
        loginbutton = (Button)findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainPage();
            }

        });
    }

    public void openRegistrationPage() {
        Intent intent = new Intent(this, registration.class);
        startActivity(intent);
    }


    public void openMainPage() {
        Intent intent = new Intent(this, Order.class);
        startActivity(intent);
    }


}
