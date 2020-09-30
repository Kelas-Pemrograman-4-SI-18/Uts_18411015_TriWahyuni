package com.yuni.uts_18411015_triwahyuni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNpm, edtNama, edtMatkul, edtTugas, edtUTS, edtUAS;
    Button btnHitung;
    TextView txtNilai, txtGrade, txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtMatkul = (EditText) findViewById(R.id.edtMatkul);
        edtTugas = (EditText) findViewById(R.id.tugas);
        edtUTS = (EditText) findViewById(R.id.uts);
        edtUAS = (EditText) findViewById(R.id.uas);
        txtGrade = (TextView)findViewById(R.id.nilaigrade);
        txtHasil  = (TextView) findViewById(R.id.txtHasil);
        btnHitung = (Button) findViewById(R.id.tombol);
        txtNilai  = (TextView) findViewById(R.id.nilaiakhir);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strMatkul = edtMatkul.getText().toString();
                String strGrade = txtGrade.getText().toString();
                String tugas = edtTugas.getText().toString().trim();
                String uts = edtUTS.getText().toString().trim();
                String uas = edtUAS.getText().toString().trim();


                double T = Double.parseDouble(tugas);
                double U = Double.parseDouble(uts);
                double UAS = Double.parseDouble(uas);
                double Nilai = (0.3 * T) + (0.3 * U) + (0.4 * UAS);


                if (Nilai >= 80&&Nilai<=100) {
                    strGrade = "A";
                } else if (Nilai >= 70&&Nilai<=80) {
                    strGrade = "B";
                } else if (Nilai >= 60&&Nilai<=70) {
                    strGrade = "C";
                } else if (Nilai >= 50&&Nilai<=60) {
                    strGrade = "D";
                } else {
                    strGrade = "E";
                }

                txtNilai.setText("NPM : " +strNpm + "\n" + "NAMA : " +strNama + "\n" + "MATA KULIAH : " + strMatkul + "\n"   + "GRADE : " + strGrade + "\n" + "Total Nilai : " + Nilai );

            }
        });
    }
}