package com.example.parameter_act3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        TextView tvnama, tvnomor;
        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);
        switch (nama) {
            case "Dee":
                tvnama.setText("Dhiya Aulia");
                tvnomor.setText("0895613768080");
                break;

            case "Uyun":
                tvnama.setText("Baharuddin Uyun");
                tvnomor.setText("0897854535698");
                break;

            case "Elin":
                tvnama.setText("Perlita Eilien");
                tvnomor.setText("0876795678968");
                break;

            case "Aini":
                tvnama.setText("Aini Nafisah");
                tvnomor.setText("0835446787989");
                break;

            case "Egi":
                tvnama.setText("Ilham Egi A");
                tvnomor.setText("0876644365589");
                break;
            case "Audi":
                tvnama.setText("Auditya");
                tvnomor.setText("081378748590");
                break;
            case "Ilham":
                tvnama.setText("Ilham Fauzi");
                tvnomor.setText("0857945848387");
                break;


        }
    }
}