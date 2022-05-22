package dev.Queenter.galleryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Food5 : AppCompatActivity() {
    lateinit var btnPrevFood4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food5)
        btnPrevFood4 = findViewById(R.id.btnPrevFood4)

        btnPrevFood4.setOnClickListener {
            val intent = Intent(this,Food4::class.java)
            startActivity(intent)
        }
    }
}