package com.example.opilane.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText opr1;
    private EditText opr2;
    private Button bin_liida;
    private Button bin_lahuta;
    private Button bin_korruta;
    private Button bin_jaga;
    private Button bin_kustuta;
    private EditText result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opr1 = (EditText) findViewById(R.id.editOp1);
        opr2 = (EditText) findViewById(R.id.editOp2);
        bin_liida = (Button) findViewById(R.id.btn_liida);
        bin_jaga = (Button) findViewById(R.id.btn_jaga);
        bin_korruta = (Button) findViewById(R.id.btn_korruta);
        bin_lahuta = (Button) findViewById(R.id.btn_lahuta);
        bin_kustuta = (Button) findViewById(R.id.btn_kustuta);
        result = (EditText) findViewById(R.id.result);

    }
    public void liidaArvud(View v){
        int a = Integer.parseInt(opr1.getText().toString());
        int b = Integer.parseInt(opr2.getText().toString());
        int summa = a+b;
        result.setText(Integer.toString(summa));
    }
    public void lahutaArvud(View v){
        int a = Integer.parseInt(opr1.getText().toString());
        int b = Integer.parseInt(opr2.getText().toString());
        int summa = a-b;
        result.setText(Integer.toString(summa));
    }
    public void korrutaArvud(View v){
        int a = Integer.parseInt(opr1.getText().toString());
        int b = Integer.parseInt(opr2.getText().toString());
        int summa = a*b;
        result.setText(Integer.toString(summa));
    }
    public void jagaArvud(View v){
        int a = Integer.parseInt(opr1.getText().toString());
        int b = Integer.parseInt(opr2.getText().toString());
        int summa = a/b;
        result.setText(Integer.toString(summa));
    }
    public void kustutaArvud(View v){
        result.setText("0.00");
        opr1.setText("");
        opr2.setText("");
    }
}
