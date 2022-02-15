package com.senai.calculadoraimc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

private lateinit var pesoEditText: EditText
private lateinit var alturaEditText: EditText
val decimal = DecimalFormat("#.##")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)


        calcular.setOnClickListener() {

            pesoEditText = findViewById(R.id.peso)
            alturaEditText = findViewById(R.id.altura)

            if (validarCampos()) {
                val peso = pesoEditText.text.toString().toDouble()
                val altura = alturaEditText.text.toString().toDouble()
                val resultado = findViewById<TextView>(R.id.resultado)
                //val imc = peso / (altura * altura)

                val imc = calcularImc(peso, altura)
                resultado.text = statusImc(imc)


            }


        }
    }


    private fun validarCampos(): Boolean {
        var noError = true
        if (pesoEditText.text.isBlank()) {
            pesoEditText.setError("Informe seu peso")
            noError = false
        }
        if (alturaEditText.text.isBlank()) {
            alturaEditText.setError("Informe sua altura")
            noError = false
        }
        return noError
    }
}