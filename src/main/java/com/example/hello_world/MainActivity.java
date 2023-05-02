 package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Register(View viewA){
        EditText fsName = findViewById(R.id.inFsName);
        TextView txtFsNameA = findViewById(R.id.txtFsName);
        txtFsNameA.setText("First Name: " + fsName.getText().toString());

        EditText lsName = findViewById(R.id.inLsName);
        TextView txtLsNameA = findViewById(R.id.txtLsName);
        txtLsNameA.setText("Last Name: " + lsName.getText().toString());

        EditText email = findViewById(R.id.inEmail);
        TextView txtEmailA = findViewById(R.id.txtEmail);
        txtEmailA.setText("Email Address: " + email.getText().toString());
    }
}