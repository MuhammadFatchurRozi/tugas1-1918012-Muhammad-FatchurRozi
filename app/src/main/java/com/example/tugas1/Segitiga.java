package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tugas1.R;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas =
                (EditText) findViewById(R.id.edit_alas);
        final EditText tinggi =
                (EditText) findViewById(R.id.edit_tinggi);
        final EditText hitunghasil =
                (EditText) findViewById(R.id.edit_hasil);
        final Button hitung =
                (Button)findViewById(R.id.bt_hitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(alas.length()==0 && tinggi.length()==0){
                    Toast.makeText(getApplication(),"Silahkan Masukan Nilai Alas dan tinggi",Toast.LENGTH_LONG).show();
                }else if(alas.length()==0){
                    Toast.makeText(getApplication(),"Silahkan Masukan Nilai Alas",Toast.LENGTH_LONG).show();
                }else if(tinggi.length()==0){
                    Toast.makeText(getApplication(),"Silahkan Masukan NIlai Tinggi", Toast.LENGTH_LONG).show();
                }
                else{
                    String inputAlas =alas.getText().toString();
                    String inputTinggi =tinggi.getText().toString();

                    double alas = Double.parseDouble(inputAlas);
                    double tinggi = Double.parseDouble(inputTinggi);
                    double h = alas*tinggi/2;
                    String output = String.valueOf(h);
                    hitunghasil.setText(output.toString());
                }
            }
        });

    }
}