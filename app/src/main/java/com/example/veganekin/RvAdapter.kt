package com.example.veganekin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

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
            val newIntent = Intent(mContext, VeganProductListActivity::class.java)

            newIntent.putExtra("menuInfoNo",vegan.menuInfoNo.toString())
            /*if (vegan.menuInfoNo == 1){
                newIntent.putExtra("menuInfoNo",1)
            }
            else if (vegan.menuInfoNo == 2){
                newIntent.putExtra("menuInfoNo",2)
            }
            else if (vegan.menuInfoNo == 3){
            newIntent.putExtra("menuInfoNo",3)
            }

            else if (vegan.menuInfoNo == 4){
            newIntent.putExtra("menuInfoNo",vegan.menuInfoNo)
            }
            else if (vegan.menuInfoNo == 5){
            newIntent.putExtra("menuInfoNo",5)
            }

            else if (vegan.menuInfoNo == 6){
                newIntent.putExtra("menuInfoNo",6)
            }
            else if (vegan.menuInfoNo == 7){
                newIntent.putExtra("menuInfoNo",7)
            }
            else if (vegan.menuInfoNo == 8){
                newIntent.putExtra("menuInfoNo",8)
            } */
            mContext.startActivity(newIntent)
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