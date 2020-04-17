package com.caca.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Register extends AppCompatActivity {

    EditText nama,email,phone,password,repass,adres,local;
    RadioButton rbmale, rbfemale;
    Spinner blood,res,jb;
    CheckBox ck;
    Button rgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nama = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.telepon);
        password = (EditText) findViewById(R.id.password1);
        repass = (EditText) findViewById(R.id.password2);
        adres = (EditText) findViewById(R.id.addres);
        local = (EditText) findViewById(R.id.location);
        rbmale = (RadioButton) findViewById(R.id.male);
        rbfemale = (RadioButton) findViewById(R.id.female);
        blood = (Spinner) findViewById(R.id.spinner);
        res = (Spinner) findViewById(R.id.spinner1);
        jb = (Spinner) findViewById(R.id.spinner2);
        ck = (CheckBox) findViewById(R.id.cek);
        rgs = (Button) findViewById(R.id.regs);
    }
    public void regs(View view) {
        Intent intent = new Intent(Register.this, Verify.class);
        startActivity(intent);
    }
}
