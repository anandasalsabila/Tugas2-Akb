package com.caca.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
NIM     : 10117134
Nama    : Ananda Salsabila
Kelas   : IF4
Matkul  : Aplikasi Komputasi Bergerak
Tugas   : AKB-Tugas-2


 */
//    16 April 2020, 14.12 WIB : Selesai membuat halaman activity_main
//    16 April 2020, 17.45 WIB : Selesai Membuat halaman activity_main2
//    16 April 2020, 22.26 WIB : Selesai Membuat halaman activity_main3 dan activity_main4
//    Tugas sudah selesai
//    16 April 2020, Membuat apk rilis dan mengirim file ke email. Dan upload ke github
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView view = (TextView)findViewById(R.id.Reg);
        String formattedText = "dosen't have account ? <b>Register</b>";
        // or getString(R.string.htmlFormattedText);
        view.setText(Html.fromHtml(formattedText));
    }

    public void register(View view){
        Intent intent = new Intent(MainActivity.this, Register.class);
        startActivity(intent);
    }
}
