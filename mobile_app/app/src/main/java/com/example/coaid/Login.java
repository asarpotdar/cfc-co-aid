package com.example.coaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private Button btnRegisteration;
    private Button btnLogin;
    private EditText edtUsername;
    //private EditText edtPassword;
    private android.widget.EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegisteration = (Button)findViewById(R.id.btnRegisteration);
        btnRegisteration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationPage();
            }

        });

        // Open Main Activity
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainPage();
            }

        });
    }
    public void openRegistrationPage() {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }

    public void openMainPage() {

        edtUsername = (EditText)findViewById(R.id.edtUsername);
        edtPassword= (EditText)findViewById(R.id.edtPassword);

        Intent intent= new Intent(this, Login.class);
        edtUsername.getText();

        if("sp@gmail.com".equals(edtUsername.getText().toString())){
            System.out.println("Inside SP: ");
            intent = new Intent(this, SPHomeScreen.class);
            Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
        }else if("v@gmail.com".equals(edtUsername.getText().toString())){
            System.out.println("Inside V: ");
            intent = new Intent(this, VHomeScreen.class);
            Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
        }else if("hw@gmail.com".equals(edtUsername.getText().toString())){
            System.out.println("Inside HW: ");
            intent = new Intent(this, HealthWorker.class);
            Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
        }

        // Clear Fields
        edtUsername.setText("");
        edtPassword.setText("");

        startActivity(intent);
    }
}

