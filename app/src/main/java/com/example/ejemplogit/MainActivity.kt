package com.example.ejemplogit

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
////Emanuel Reynoso Cortez este es un ejemplo
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Toast.makeText(this,"hola",Toast.LENGTH_SHORT);//hola
        Toast.makeText(this,"soy katherine",Toast.LENGTH_SHORT);
                Toast.makeText(this,"soy Jehu",Toast.LENGTH_SHORT);
        Toast.makeText(this, "¡Bienvenido a EjemploGit! 🌟", Toast.LENGTH_LONG).show()
    }
}
