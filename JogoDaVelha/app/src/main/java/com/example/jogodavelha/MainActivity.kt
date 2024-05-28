package com.example.jogodavelha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jogodavelha.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var jogador = "X"

        binding.buttonUm.setOnClickListener {
            binding.buttonUm.text = jogador
            if(jogador.equals("X")) {
                    jogador = "O"
                }else{
                    jogador = "X"
            }
            binding.buttonUm.isEnabled = false
        }
        binding.buttonDois.setOnClickListener {
            binding.buttonDois.text = jogador
            if(jogador.equals("X")) {
                jogador = "O"
            }else{
                jogador = "X"
            }
            binding.buttonDois.isEnabled = false
        }
        binding.buttonTres.setOnClickListener {
            binding.buttonTres.text = jogador
            if(jogador.equals("X")) {
                jogador = "O"
            }else{
                jogador = "X"
            }
            binding.buttonTres.isEnabled = false
        }

    }
}