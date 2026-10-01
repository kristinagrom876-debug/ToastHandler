package com.example.toasthandler

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // a. Находим кнопку по id
        val button = findViewById<Button>(R.id.button_ok)

        // b. Устанавливаем обработчик нажатия
        button.setOnClickListener {
            // Создаём Toast с текстом "Кнопка ОК" длительностью 2 секунды (LENGTH_SHORT ≈ 2 сек)
            Toast.makeText(this, "Кнопка ОК", Toast.LENGTH_SHORT).show()
        }
    }
}