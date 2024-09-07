package com.example.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val nightMode = AppCompatDelegate.getDefaultNightMode()
        setTheme(if (nightMode == AppCompatDelegate.MODE_NIGHT_YES)
            R.style.AppTheme_Dark
        else R.style.AppTheme_Light)
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val darkModeSwitch=findViewById<SwitchMaterial>(R.id.modeBt)
        val textHeading=findViewById<TextView>(R.id.nameView)
        val textDec=findViewById<TextView>(R.id.workView)
        val skillbutton= findViewById<Button>(R.id.skillBT)
        val educatebutton= findViewById<Button>(R.id.educationBT)
        val workbutton= findViewById<Button>(R.id.workBT)
        val achivebutton= findViewById<Button>(R.id.achieveBT)
        val contactmeBt=findViewById<Button>(R.id.contact)


        if(nightMode==AppCompatDelegate.MODE_NIGHT_YES){
            textHeading.setTextColor(ContextCompat.getColor(this,R.color.white))
            textDec.setTextColor(ContextCompat.getColor(this,R.color.white))
            skillbutton.setTextColor(ContextCompat.getColor(this,R.color.buttonTextColordark))
            educatebutton.setTextColor(ContextCompat.getColor(this,R.color.buttonTextColordark))
            workbutton.setTextColor(ContextCompat.getColor(this,R.color.buttonTextColordark))
            achivebutton.setTextColor(ContextCompat.getColor(this,R.color.buttonTextColordark))

        }else{
            textHeading.setTextColor(ContextCompat.getColor(this,R.color.black))
            textDec.setTextColor(ContextCompat.getColor(this,R.color.black))
            skillbutton.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColorlight))
            educatebutton.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColorlight))
            workbutton.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColorlight))
            achivebutton.setTextColor(ContextCompat.getColor(this, R.color.buttonTextColorlight))

        }

        darkModeSwitch.setOnCheckedChangeListener{ _,isChecked ->
            if (isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }


        skillbutton.setOnClickListener{
            intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }

        educatebutton.setOnClickListener{
            intent = Intent(this,WorkActivity::class.java)
            startActivity(intent)
        }

        workbutton.setOnClickListener{
            intent = Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }

        achivebutton.setOnClickListener{
            intent = Intent(this,AchievementActivity::class.java)
            startActivity(intent)
        }

        contactmeBt.setOnClickListener {
            intent=Intent(this,ContactmeActivity::class.java)
            startActivity(intent)
        }
    }


}