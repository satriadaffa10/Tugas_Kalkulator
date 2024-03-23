package com.example.tugas_kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void tambah(View v){
        EditText angka1 = (EditText) findViewById(R.id.angka1);
        EditText angka2 = (EditText) findViewById(R.id.angka2);
        int number = Integer.parseInt(angka1.getText().toString());
        int number2 = Integer.parseInt(angka2.getText().toString());

        int hasil = (number+number2);
        TextView result = (TextView) findViewById(R.id.hasil);
        result.setText("Hasil Penjumlahan "+hasil);
    }
    public void kurang(View v){
        EditText angka1 = (EditText) findViewById(R.id.angka1);
        EditText angka2 = (EditText) findViewById(R.id.angka2);
        int number = Integer.parseInt(angka1.getText().toString());
        int number2 = Integer.parseInt(angka2.getText().toString());

        int hasil = (number-number2);
        TextView result = (TextView) findViewById(R.id.hasil);
        result.setText("Hasil Pengurangan "+hasil);
    }
    public void bagi(View v){
        EditText angka1 = (EditText) findViewById(R.id.angka1);
        EditText angka2 = (EditText) findViewById(R.id.angka2);
        int number = Integer.parseInt(angka1.getText().toString());
        int number2 = Integer.parseInt(angka2.getText().toString());

        int hasil = (number/number2);
        TextView result = (TextView) findViewById(R.id.hasil);
        result.setText("Hasil Pembagian "+hasil);
    }
    public void kali(View v){
        EditText angka1 = (EditText) findViewById(R.id.angka1);
        EditText angka2 = (EditText) findViewById(R.id.angka2);
        int number = Integer.parseInt(angka1.getText().toString());
        int number2 = Integer.parseInt(angka2.getText().toString());

        int hasil = (number*number2);
        TextView result = (TextView) findViewById(R.id.hasil);
        result.setText("Hasil Perkalian "+hasil);
    }

}