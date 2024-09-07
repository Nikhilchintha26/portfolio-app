package com.example.portfolioapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SkillsActivity : AppCompatActivity() {


    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Skills>

    lateinit var skillsTitle : Array<String>
    lateinit var skillsExprence : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_skills)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        skillsTitle= arrayOf(
            "web delopement",
            "andeoid devolopemrt",
            "sql"
        )
        skillsExprence= arrayOf(
            "2 years",
            "3 years",
            "4 years"
        )
        newRecyclerView = findViewById(R.id.skill_recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf()
        getUserData()

    }

    private fun getUserData() {
        for (i in skillsExprence.indices){
      val skill=Skills(skillsTitle[i],skillsExprence[i])
      newArrayList.add(skill)
       }
        newRecyclerView.adapter=SkillsAdapter(newArrayList)
    }
}