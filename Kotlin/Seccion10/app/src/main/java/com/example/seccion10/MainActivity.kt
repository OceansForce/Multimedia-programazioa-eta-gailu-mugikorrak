package com.example.seccion10

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button_previsualizar)
        button.setOnClickListener {
            onClickPreviewClicked()
        }
    }

    private fun onClickPreviewClicked() {
       val nameEdit: TextInputEditText = findViewById(R.id.editar_nombre_de_contacto)
       val numberEdit: TextInputEditText = findViewById(R.id.editar_numero_de_contacto)
    }


}

