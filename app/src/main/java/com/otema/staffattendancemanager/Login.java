package com.otema.staffattendancemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private Button btnSignUp, btnLogin;
    private EditText uname, pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Get the reference of the buttons and text fields

        btnLogin = (Button)findViewById(R.id.sign_in_button);
        btnSignUp = (Button) findViewById(R.id.sign_up_button);
        uname = (EditText) findViewById(R.id.username);
        pwd = (EditText) findViewById(R.id.password);
        btnSignUp.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
switch (view.getId()){
    case R.id.sign_in_button:

        break;
    case R.id.sign_up_button:
        Intent sign_up = new Intent(getApplicationContext(),Register.class);
        startActivity(sign_up);
        finish();
        break;
    default:

}
    }
}
