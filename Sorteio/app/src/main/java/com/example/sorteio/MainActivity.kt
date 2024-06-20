package com.example.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sorteio.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonSortear.setOnClickListener {
            try {
                val inicio = binding.editInicio.text.toString().toInt()
                val fim = binding.editFim.text.toString().toInt()

                if (inicio >= fim) {
                    binding.textResultado.text = "O valor inicial deve ser menor que o valor final."
                    return@setOnClickListener
                }

                val randomNumero = Random.nextInt(inicio, fim + 1)

                binding.textResultado.text = randomNumero.toString()
            } catch (e: NumberFormatException) {
                binding.textResultado.text = "Por favor, insira números válidos."
            }
        }

    }
}