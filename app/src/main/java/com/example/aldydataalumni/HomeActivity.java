package com.example.aldydataalumni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button ActionHome, ActionBerita, ActionProfile;
    EditText etNIM, etNama, etTempatLahir,  etTglLahir, etAlamat, etAgama,etThnLulus, etPekerjaan, etJabatan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);
    }

    @Override
    public void onClick(View v) {

    }
}