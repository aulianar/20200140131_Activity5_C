package com.example.constraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variable btnLogin dengan componen button pada Layout
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variable edEmail dengan componen button pada Layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variable edPassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclivk pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //menyimpan input user di edittext email kedalam variable nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variable nama
                password = edpassword.getText().toString();

                //mengeset email yang benar
                String email = "admin@mail.com";

                //mengeset password yang benar
                String pass = "123";

                if (nama.isEmpty() || password.isEmpty()) {
                    //membuat variable toast dan menampilkan pesan "edittext tidak boleh kosong"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan pasword wajib diisi!!!", Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                }

                else {
                    //mengecek apakah isi dari email dan password sudah sama dengan email dan password yang sudah diset
                    if (nama.equals(email) && password.equals(pass)) {
                        //membuat variable toast dan menampilkan pesan "Login Sukses"
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses", Toast.LENGTH_LONG);
                        //menampilkan toast
                        t.show();

                        //membuat objek bundle
                        Bundle b = new Bundle();

                        //memasukan value dari variable password dengan kunci "a" dan dimasukan kedalam bundle
                        b.putString("a", nama.trim());

                        //memasukan value dari variable password dengan kunci "b" dan dimasukan kedalam bundle
                        b.putString("b", password.trim());

                        //membuat objek intent berpinah activity dari mainactivity ke Home Activity
                        Intent i = new Intent(getApplicationContext(), Home_Activity.class);

                        //memasukan bundle kedalam intent untuk dikirimkan ke Home Activity
                        i.putExtras(b);

                        //berpindah ke Home Activity
                        startActivity(i);
                    }
                    else {
                        //membuat variable toast dan menampilkan pesan "Login Gagal"
                        Toast t = Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_LONG);

                        //menampilkan toast
                        t.show();
                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //Method untuk menampilkan menu
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //Mmebuat kondisi jika yang dipilih adalah id mnDaftar
        if (item.getItemId() == R.id.mnDaftar)
        {
            //Method untuk memanggil activity "form_pendaftaran"
            Intent i = new Intent(getApplicationContext(), Home_Activity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}