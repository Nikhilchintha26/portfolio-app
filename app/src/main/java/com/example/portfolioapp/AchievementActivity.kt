package com.example.portfolioapp

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AchievementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_achievement)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val achievementLayout=findViewById<LinearLayout>(R.id.achieveLayout)

        val achievements= listOf(
            "Achievement1 : description" ,
            "Achievement2 : description",
            "Achievement3 : description"
        )

        for (achievement in achievements){
            val textView=TextView(this)
            textView.text=achievement
            textView.textSize=17f
            textView.layoutParams=LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            textView.setPadding(0,8,0,8)
            achievementLayout.addView(textView)
        }
    }
}