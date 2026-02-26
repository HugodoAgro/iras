package com.exemplo.meuapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.exemplo.meuapp.databinding.ActivityEntradaSoloBinding
import com.exemplo.meuapp.models.Solo

class EntradaSoloActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEntradaSoloBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradaSoloBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configurarBotao()
    }

    private fun configurarBotao() {

        binding.btnCalcular.setOnClickListener {

            val solo = Solo(
                nitrogenio = binding.edtN.text.toString().toDoubleOrNull() ?: 0.0,
                fosforo = binding.edtP.text.toString().toDoubleOrNull() ?: 0.0,
                potassio = binding.edtK.text.toString().toDoubleOrNull() ?: 0.0,
                calcio = binding.edtCa.text.toString().toDoubleOrNull() ?: 0.0,
                magnesio = binding.edtMg.text.toString().toDoubleOrNull() ?: 0.0,
                boro = binding.edtB.text.toString().toDoubleOrNull() ?: 0.0,
                zinco = binding.edtZn.text.toString().toDoubleOrNull() ?: 0.0,
                cobre = binding.edtCu.text.toString().toDoubleOrNull() ?: 0.0,
                manganes = binding.edtMn.text.toString().toDoubleOrNull() ?: 0.0,
                ferro = binding.edtFe.text.toString().toDoubleOrNull() ?: 0.0,
                aluminio = binding.edtAl.text.toString().toDoubleOrNull() ?: 0.0,
                hAl = binding.edtHal.text.toString().toDoubleOrNull() ?: 0.0
            )

            val culturaNome = intent.getStringExtra("cultura_nome")

            val intentResultado = Intent(this, ResultadoActivity::class.java)
            intentResultado.putExtra("cultura_nome", culturaNome)
            intentResultado.putExtra("solo", solo)

            startActivity(intentResultado)
        }
    }
}
