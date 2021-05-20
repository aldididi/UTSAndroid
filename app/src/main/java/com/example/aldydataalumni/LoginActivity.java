package com.example.aldydataalumni;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etEmail, etPassword;
    Button btLogin;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sharedPreferences = getSharedPreferences("Pendataan Alumni", MODE_PRIVATE);


        etEmail = findViewById(R.id.email);
        etPassword = findViewById(R.id.password);
        btLogin = findViewById(R.id.login);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etEmail.getText().toString().length() > 0 && etPassword.getText().toString().length()>0){
                    //login check
                    if (etEmail.getText().toString().equals("aldyh@mail.com") && etPassword.getText().toString().equals("123456")){
                        //sukses login nih
                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class );
                        startActivity(intent);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("email", "aldy@mail.com");
                        editor.putString("nim", "4817090051");
                        editor.putString("nama", "Aldy");
                        editor.putString("kelas", "TI6");
                        editor.apply();
                        finish();
                    } else  {
                        Toast.makeText(LoginActivity.this, "Email atau Password Salah", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this,"LENGKAPI DATA", Toast.LENGTH_SHORT).show();
                }
               /* if (etEmail.getText().toString().equals("aldy@mail.com") &&
                etPassword.getText().toString().equals("1234")){
                    AlertDialog.Builder builder = new AlertDialog.Builder(
                            LoginActivity.this
                    );
                    builder.setIcon(R.drawable.ic_check_circle);
                    builder.setTitle("Sukses");
                    builder.setMessage("sELAMAT DATANG");

                    builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Salah", Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }
}