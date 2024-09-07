package com.example.portfolioapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

data class  Skills(var skillHeading :String, var skillExperience :String)


class SkillsAdapter (private val skillsList:ArrayList<Skills>):
        RecyclerView.Adapter<SkillsAdapter.MyViewHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
                val itemlist=LayoutInflater.from(parent.context).inflate(R.layout.list_skills,parent,false)
                return MyViewHolder(itemlist)
        }

        override fun getItemCount(): Int {
                return skillsList.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
             val currentItem=skillsList[position]
                holder.skillsTitle.text=currentItem.skillHeading
                holder.skillsExprence.text=currentItem.skillExperience
        }

        class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
             val skillsTitle:TextView=itemView.findViewById(R.id.skillTitle)
                val skillsExprence:TextView=itemView.findViewById(R.id.skillExperience)

        }
}



