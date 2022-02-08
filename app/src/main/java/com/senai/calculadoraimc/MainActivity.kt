package com.senai.calculadoraimc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        val decimal = DecimalFormat("#.##")

        calcular.setOnClickListener() {
            val peso = findViewById<EditText>(R.id.peso).text.toString().toDouble()
            val altura = findViewById<EditText>(R.id.altura).text.toString().toDouble()
            val resultado = findViewById<TextView>(R.id.resultado)
            val imc = peso / (altura * altura)



            if (imc < 18.5) {
                resultado.text =
                    "Seu imc é: " + decimal.format(imc) + "\n" + "Status: Abaixo do Peso"
                resultado.setTextColor(Color.RED)
            }else if (imc > 18.5 && imc < 24.9){
                resultado.text = "Seu imc é: " + decimal.format(imc) + "\n" + "Status: Peso normal"
                resultado.setTextColor(Color.GREEN)
            }else if(imc>25 && imc <29.9){
                resultado.text = "Seu imc é: " + decimal.format(imc) + "\n" + "Status: Sobrepeso"
                resultado.setTextColor(Color.YELLOW)
            }else if(imc>30 && imc <=34.9){
                resultado.text = "Seu imc é: " + decimal.format(imc) + "\n" + "Status: Obesidade Grau I"
                resultado.setTextColor(Color.YELLOW)
            }else if(imc>35 && imc <=39.9){
                resultado.text = "Seu imc é: " + decimal.format(imc)  + "\n" + "Status: Obesidade Grau II"
                resultado.setTextColor(Color.YELLOW)
            }else {
                resultado.text =
                "Seu imc é: " + decimal.format(imc) + "\n" + "Status: Obesidade Grau III (Mórbita)"
                resultado.setTextColor(Color.RED)
        }
        }
    }
}