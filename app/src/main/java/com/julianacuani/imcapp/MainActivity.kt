package com.julianacuani.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
       calcularBTN.setOnClickListener {
           calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
       }
    }

    private fun calcularIMC(peso: String, altura: String) {
        val peso =peso.toFloatOrNull()
        val altura =altura.toFloatOrNull()

        if (peso != null && altura != null){
            val imc = peso /(altura * altura)
            titleTxt.text = "Seu IMC é \n %.2f".format(imc)
        }
    }
}
