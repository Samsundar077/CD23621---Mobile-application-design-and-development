package com.example.experiment_1_madd_46

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.graphics.Color
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val main = findViewById<LinearLayout>(R.id.main)
        val tv = findViewById<TextView>(R.id.tv)
        val btntxtsize = findViewById<Button>(R.id.btntxtsize)
        val btntxtcolor = findViewById<Button>(R.id.btntxtcolor)
        val bgcolor = findViewById<Button>(R.id.bgcolor)

        var fontSize: Float = 10f
        btntxtsize.setOnClickListener {
            tv.setTextSize(fontSize)
            fontSize = ((fontSize+10)%50)
        }

        var fontColor: Int=5
        btntxtcolor.setOnClickListener {
            when(fontColor%5){
                0 -> tv.setTextColor(Color.RED)
                1 -> tv.setTextColor(Color.YELLOW)
                2 -> tv.setTextColor(Color.BLUE)
                3 -> tv.setTextColor(Color.GREEN)
                4 -> tv.setTextColor(Color.MAGENTA)
            }
            fontColor++
        }

        var bg: Int=5
        bgcolor.setOnClickListener {
            when(bg%5){
                1 -> main.setBackgroundColor(Color.RED)
                2 -> main.setBackgroundColor(Color.YELLOW)
                3 -> main.setBackgroundColor(Color.BLUE)
                4 -> main.setBackgroundColor(Color.GREEN)
                0 -> main.setBackgroundColor(Color.MAGENTA)
            }
            bg++
        }
    }
}
