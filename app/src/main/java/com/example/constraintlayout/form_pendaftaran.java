package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class form_pendaftaran extends AppCompatActivity {

    //Deklarasi variabel dengan tipe dta EditText
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    //Deklarasi variabel dengan tipe data Floating Action Button
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pendaftaran);

        //Menghubungkan variabel edtNama, edtAlamat, edtEmail, edtPAssword, edtrepass, fab dengan componen button pada layout
        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.edEmail);
        edtPassword = findViewById(R.id.edPassword);
        edtrepass = findViewById(R.id.edrepass);
        FloatingActionButton fab = findViewById(R.id.fabSimpan);

        //membuat method untuk event dari floating button
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //membuat kondisi untuk mengecek apakah EditText kosong atau tidak
                if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty())
                {
                    //menampilkan pesan notifikasi jika seluruh EditText wajib diisi
                    Snackbar.make(view, "Wajib isi seluruh data !!!!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    //membuat kondisi untuk mengecek apakah isi dari EditText password dan EditText Repassword sama atau tidak
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        //menampilkan pesan notifikasi jika pendaftaram berhasil
                        Toast.makeText(getApplicationContext(), "Pendaftaran berhasil...", Toast.LENGTH_SHORT).show();

                        //method untuk kembali ke activity Main
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        //menampilkan pesan bahwa isi dari EditText password dan ExitText repassword tidak sama
                        Snackbar.make(view, "Password dan Repassword harus sama !!!", Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}