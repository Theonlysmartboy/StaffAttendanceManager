package com.otema.staffattendancemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener{
    private Button btnsignup;
    private EditText uname,pwd,rpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnsignup = (Button) findViewById(R.id.buttonCreateAccount);
        uname = (EditText) findViewById(R.id.editTextUserName);
        pwd = (EditText) findViewById(R.id.editTextPassword);
        rpwd = (EditText) findViewById(R.id.editTextConfirmPassword);
        btnsignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
