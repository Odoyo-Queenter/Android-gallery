package dev.Queenter.galleryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Food4 : AppCompatActivity() {
    lateinit var btnNextFood5: Button
    lateinit var  btnPrevFood3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food4)
        btnNextFood5 = findViewById(R.id.btnNextFood5)
        btnPrevFood3 = findViewById(R.id.btnPrevFood3)

        btnNextFood5.setOnClickListener {
            val intent = Intent(this,Food5::class.java)
            startActivity(intent)
        }
        btnPrevFood3.setOnClickListener {
            val intent = Intent(this,Food3::class.java)
            startActivity(intent)
        }
    }
}