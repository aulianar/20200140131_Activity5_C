package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {
    //mendeklarasikan variable dengan tipe data Textview
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //menghubungkan variable txEmail dengan componen TextView pada Layout
        txEmail = findViewById(R.id.tvEmail);

        //menghubungkan variable txEmail dengan componen TextView pada Layout
        txPassword = findViewById(R.id.tvPassword);

        //membuat objek bundle dan mengambil data yang dikirimkan dari activity sebelumnya
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan unyuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //membuat variabel string yang digunakan unyuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //menampilkan value dari variabel pass kedalam txpassword
        txPassword.setText(pass);
    }
}