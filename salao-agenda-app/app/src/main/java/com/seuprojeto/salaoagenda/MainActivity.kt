package com.seuapp.agendamentolapa

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nomeInput = findViewById<EditText>(R.id.inputNome)
        val dataInput = findViewById<EditText>(R.id.inputData)
        val horaInput = findViewById<EditText>(R.id.inputHora)
        val btnAgendar = findViewById<Button>(R.id.btnAgendar)

        btnAgendar.setOnClickListener {
            val nome = nomeInput.text.toString()
            val data = dataInput.text.toString()
            val hora = horaInput.text.toString()

            if (nome.isNotEmpty() && data.isNotEmpty() && hora.isNotEmpty()) {
                Toast.makeText(this, "Agendamento feito para $nome em $data às $hora", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
