package dev.Queenter.galleryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button

class Food3 : AppCompatActivity() {
    lateinit var btnNextFood4: Button
    lateinit var btnPrevFood2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food3)
        btnNextFood4 = findViewById(R.id.btnNextFood4)
        btnPrevFood2 = findViewById(R.id.btnPrevFood2)

        btnNextFood4.setOnClickListener {
            val intent = Intent(this,Food4::class.java)
            startActivity(intent)
        }
        btnPrevFood2.setOnClickListener {
            val intent = Intent(this,Food2::class.java)
            startActivity(intent)
        }
    }
}