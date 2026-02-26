package com.exemplo.meuapp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.exemplo.meuapp.data.CulturasDisponiveis
import com.exemplo.meuapp.databinding.ActivitySelecaoCulturaBinding

class SelecaoCulturaActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelecaoCulturaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelecaoCulturaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarSpinner()
        configurarBotao()
    }

    private fun configurarSpinner() {
        val nomesCulturas = CulturasDisponiveis.lista.map { it.nome }

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            nomesCulturas
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerCulturas.adapter = adapter
    }

    private fun configurarBotao() {
        binding.btnContinuar.setOnClickListener {
            val culturaSelecionadaNome = binding.spinnerCulturas.selectedItem.toString()

            val intent = Intent(this, EntradaSoloActivity::class.java)
            intent.putExtra("cultura_nome", culturaSelecionadaNome)
            startActivity(intent)
        }
    }
}
