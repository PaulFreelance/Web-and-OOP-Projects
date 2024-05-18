/*package com.example.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication12.R;

public class LoginActivity extends AppCompatActivity {
    EditText password,user;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password);
    }
    public void loginBtn(View view){
        String nume = user.getText().toString();
        String parola = password.getText().toString();
        Background bg = new Background(this);
        bg.execute(user,password);
    }
}*/
