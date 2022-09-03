package com.example.veganekin.firstpage

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.veganekin.*
import com.example.veganekin.secondpage.VeganProductListActivity
import com.example.veganekin.secondpage.VeganSecondMenu2
import com.example.veganekin.vegancalculator.VeganCalculator
import com.example.veganekin.whatisveganism.WhatIsVeganismActivity
import com.example.veganekin.whatwouldieat.EatTodayActivity

class RvAdapter(private val mContext:Context,private val veganMenuList:List<VeganObjects>)
    : RecyclerView.Adapter<RvAdapter.CardViewDesignObjectsHolder>() {
    inner class CardViewDesignObjectsHolder(view:View):RecyclerView.ViewHolder(view){

        var menuCardView:CardView
        var menuTextView:TextView


        init {
            menuCardView = view.findViewById(R.id.menuCardView)
            menuTextView = view.findViewById(R.id.menuText)

        }



    }



    override fun onBindViewHolder(holder: CardViewDesignObjectsHolder, position: Int) {
       val vegan = veganMenuList[position]

        holder.menuTextView.text = vegan.menuName

        holder.menuCardView.setOnClickListener {
            val newIntent:Intent

            if (vegan.menuInfoNo == 1){
                 newIntent = Intent(mContext, VeganProductListActivity::class.java)
                newIntent.putExtra("menuInfoNo",vegan.menuInfoNo.toString())
                mContext.startActivity(newIntent)

            }
            else if (vegan.menuInfoNo == 2){
                newIntent = Intent(mContext, VeganSecondMenu2::class.java)
                newIntent.putExtra("menuInfoNo",vegan.menuInfoNo.toString())
                mContext.startActivity(newIntent)
            }
            else if (vegan.menuInfoNo == 3){
                newIntent = Intent(mContext, VeganSecondMenu2::class.java)
                newIntent.putExtra("menuInfoNo",vegan.menuInfoNo.toString())
                mContext.startActivity(newIntent)
            }

            else if (vegan.menuInfoNo == 4){
                newIntent = Intent(mContext, VeganProductListActivity::class.java)
                newIntent.putExtra("menuInfoNo",vegan.menuInfoNo.toString())
                mContext.startActivity(newIntent)

            }
            else if (vegan.menuInfoNo == 5){
                newIntent = Intent(mContext, EatTodayActivity::class.java)
                newIntent.putExtra("menuInfoNo",vegan.menuInfoNo.toString())
                mContext.startActivity(newIntent)
            }

            else if (vegan.menuInfoNo == 6){
                newIntent = Intent(mContext, WhatIsVeganismActivity::class.java)
                newIntent.putExtra("menuInfoNo",vegan.menuInfoNo.toString())
                mContext.startActivity(newIntent)

            }
            else if (vegan.menuInfoNo == 7){
                newIntent = Intent(mContext, VeganCalculator::class.java)
                newIntent.putExtra("menuInfoNo",vegan.menuInfoNo.toString())
                mContext.startActivity(newIntent)


            }
            else if (vegan.menuInfoNo == 8){
                 newIntent = Intent(mContext, VeganProductListActivity::class.java)
                newIntent.putExtra("menuInfoNo",vegan.menuInfoNo.toString())
                mContext.startActivity(newIntent)

            }

                Toast.makeText(mContext, " ${vegan.menuName}  Seçtiniz", Toast.LENGTH_SHORT).show()

        }
    }

    override fun getItemCount(): Int {
        return veganMenuList.size

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectsHolder {
        val design = LayoutInflater.from(mContext).inflate(R.layout.card_design,parent,false)

        return CardViewDesignObjectsHolder(design)
    }


}