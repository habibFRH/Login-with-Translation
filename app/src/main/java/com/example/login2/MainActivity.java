package com.example.login2;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final EditText editTextUsername = findViewById(R.id.editTextUsername);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final EditText editTextPassword = findViewById(R.id.editTextTextPassword);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Check login credentials
                if ("admin".equals(username) && "password".equals(password)) {
                    showToast(getString(R.string.login_successful));
                } else {
                    showToast(getString(R.string.invalid_credentials));
                }
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
