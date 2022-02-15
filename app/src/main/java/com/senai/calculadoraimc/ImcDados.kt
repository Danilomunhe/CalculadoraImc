package com.senai.calculadoraimc

fun statusImc(imc: Double): String {
    if (imc < 18.5) {
        return "Seu imc é: " + decimal.format(imc) + "\n" + "Status: Abaixo do Peso"
    } else if (imc > 18.5 && imc < 24.9) {
        return "Seu imc é: " + decimal.format(imc) + "\n" + "Status: Peso normal"
    } else if (imc > 25 && imc < 29.9) {
        return "Seu imc é: " + decimal.format(imc) + "\n" + "Status: Sobrepeso"
    } else if (imc > 30 && imc <= 34.9) {
        return "Seu imc é: " + decimal.format(imc) + "\n" + "Status: Obesidade Grau I"
    } else if (imc > 35 && imc <= 39.9) {
        return "Seu imc é: " + decimal.format(imc) + "\n" + "Status: Obesidade Grau II"
    } else {
        return "Seu imc é: " + decimal.format(imc) + "\n" + "Status: Obesidade Grau III (Mórbita)"
    }
}

fun calcularImc(peso: Double, altura: Double): Double {
    var calculo = peso / (altura * altura)
    return calculo
}