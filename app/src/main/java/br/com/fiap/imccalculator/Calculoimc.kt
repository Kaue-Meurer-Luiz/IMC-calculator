package br.com.fiap.imccalculator

import kotlin.math.pow

fun calcularImc(pesoUsuario: Double, alturaUsuario: Double): Double{
    var imc = pesoUsuario / (alturaUsuario /100).pow(2)
    return imc

}

fun obterStatusImc(imcUsuario: Double): String {
    return if (imcUsuario < 18.5) {
        "Abaixo do peso"
    }
    else if (imcUsuario >= 18.5 && imcUsuario < 25.0){
        "Peso ideal"
    }
    else if (imcUsuario >=25.0 && imcUsuario < 30.0){
        "Levemente acima do peso"
    }
    else if (imcUsuario >= 30.0 && imcUsuario< 35.0){
        "Obesidade Grau I"
    }
    else if (imcUsuario >= 35.0 && imcUsuario < 40.0){
        "Obesidade Grau II"
    }
    else {"Obesidade Grau III"}
}