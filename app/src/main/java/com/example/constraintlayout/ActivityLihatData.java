package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Jungwon":
                tvnama.setText("Yang Jungwon");
                tvnomor.setText("20200140001");
                break;
            case "Heeseung":
                tvnama.setText("Lee Heeseung");
                tvnomor.setText("20200140002");
                break;
            case "Jay":
                tvnama.setText("Park Jeongseong");
                tvnomor.setText("20200140003");
                break;
            case "Jake":
                tvnama.setText("Shim Jaeyun");
                tvnomor.setText("20200140004");
                break;
            case "Sunghoon":
                tvnama.setText("Park Sunghoon");
                tvnomor.setText("20200140005");
                break;
            case "Sunoo":
                tvnama.setText("Kim Sunoo");
                tvnomor.setText("20200140006");
                break;
            case "NI-ki":
                tvnama.setText("Nishimura Riki");
                tvnomor.setText("20200140007");
                break;
            case "James":
                tvnama.setText("James");
                tvnomor.setText("20200140008");
                break;
            case "JJ":
                tvnama.setText("JayJay");
                tvnomor.setText("20200140009");
                break;
            case "Yorch":
                tvnama.setText("Yorch Yongsin");
                tvnomor.setText("20200140010");
                break;
        }
    }
}