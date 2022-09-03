package com.example.veganekin.lastpage

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.veganekin.R
import com.example.veganekin.firstpage.MainActivity
import com.example.veganekin.firstpage.VeganObjects

class LastPageAdapter(private val mContext: Context, private val veganLastPageList:List<LastVeganProduct>)
    : RecyclerView.Adapter<LastPageAdapter.CardViewDesignObjectHolder2>(){

    inner class CardViewDesignObjectHolder2(view: View): RecyclerView.ViewHolder(view)
{
        var lastCardView:CardView
        var lastImageView:ImageView

        init{
            lastCardView = view.findViewById(R.id.lastCardView)
            lastImageView = view.findViewById(R.id.lastImageView)

        }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder2 {
        val design = LayoutInflater.from(mContext).inflate(R.layout.last_card_design,parent,false)

        return CardViewDesignObjectHolder2(design)
    }



    override fun getItemCount(): Int {
        return veganLastPageList.size
    }

    override fun onBindViewHolder(holder: CardViewDesignObjectHolder2, position: Int) {
        val vegan = veganLastPageList[position]

        holder.lastImageView.setImageResource(mContext.resources.getIdentifier(vegan.productimage,"drawable",mContext.packageName))
        holder.lastCardView.setOnClickListener {
            val newIntent:Intent

            newIntent=Intent(mContext,MainActivity::class.java)
            mContext.startActivity(newIntent)
        }
    }


}