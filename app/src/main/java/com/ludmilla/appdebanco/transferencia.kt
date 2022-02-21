package com.ludmilla.appdebanco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ludmilla.appdebanco.databinding.ActivityTransferenciaBinding

class transferencia : AppCompatActivity() {
    private lateinit var binding: ActivityTransferenciaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar = binding.toolbarTransferencia
        toolbar.title = "Transferências"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(100,0,100,0)
        toolbar.setBackgroundColor(getColor(R.color.blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}