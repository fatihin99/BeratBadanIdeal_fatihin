package com.example.beratbadanideal_fatihin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var inputnama : EditText
    private lateinit var inputtinggi : EditText
    private lateinit var jklakilaki : RadioButton
    private lateinit var jkperempuan : RadioButton
    private lateinit var prosesdata : Button
    private lateinit var hasile : TextView
    private var tb : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inputnama = findViewById(R.id.ETnama)
        inputtinggi = findViewById(R.id.ETtinggi)
        jklakilaki = findViewById(R.id.rbLAkilaki)
        jkperempuan = findViewById(R.id.rbPerempuan)
        prosesdata = findViewById(R.id.BTproses)
        hasile = findViewById(R.id.TVhasil)
        //
        prosesdata.setOnClickListener {
            var tinggi = inputtinggi.text.toString().toInt()

            if (jklakilaki.isChecked){
                tb = (tinggi - 100) - ((tinggi - 100) * 10 / 100)
            hasile.setText(tb.toString() + "kg")
            }else{
                tb = (tinggi - 100) - ((tinggi - 100) * 15/100)
                hasile.setText(tb.toString()+"kg")
            }
        }
    }
}