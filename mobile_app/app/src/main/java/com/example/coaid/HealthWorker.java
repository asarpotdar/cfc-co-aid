package com.example.coaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class HealthWorker extends AppCompatActivity {
    private Button btnHealthWorkerSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_worker);
        btnHealthWorkerSubmit = (Button) findViewById(R.id.health_worker_submit);
        btnHealthWorkerSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationPage();
            }
        });

        Spinner spinner = findViewById(R.id.health_worker_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.health_worker_type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void openRegistrationPage() {

        Intent intent = new Intent(this, HealthWorker.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Data Submitted Successful", Toast.LENGTH_LONG).show();
    }
}
