package com.example.pavel.authorization;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private Map<String, String> usersDb = new HashMap<>();
    private EditText editTextLogin;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        editTextLogin = (EditText) findViewById(R.id.editLogin);
        editTextPassword = (EditText) findViewById(R.id.editPassword);

    }

    public void buttonOkLoginClicked(View view) {
        // TODO: add login/password check
        startActivity(new Intent(context, HelloActivity.class));
    }

    public void buttonRegistrationClicked(View view) {
        startActivity(new Intent(context, RegistrationActivity.class));
    }
}
