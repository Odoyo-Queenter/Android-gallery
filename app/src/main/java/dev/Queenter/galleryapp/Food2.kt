package dev.Queenter.galleryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Food2 : AppCompatActivity() {
    lateinit var btnNext:Button
    lateinit var btnPrevMain:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food2)
        btnNext = findViewById(R.id.btnNextFood3)
        btnPrevMain = findViewById(R.id.btnPrevMain)

        btnNext.setOnClickListener {
            val intent = Intent(this,Food3::class.java)
            startActivity(intent)
        }
        btnPrevMain.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}