package com.example.veganekin.secondpage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.veganekin.R

class VeganSecondMenu2Adapter ( private val mContext: Context,private val veganMenuList:List<VeganProduct>)
    : RecyclerView.Adapter<VeganSecondMenu2Adapter.CardViewDesignObjectsHolderSecond2>() {

    inner class CardViewDesignObjectsHolderSecond2(view: View):RecyclerView.ViewHolder(view){
    var cardgroup2: CardView
    var textGroup2: TextView

     init {

        cardgroup2 = view.findViewById(R.id.Cardgroup2)
        textGroup2 = view.findViewById(R.id.textGroup2)


    }
}
override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectsHolderSecond2 {

    val design3 = LayoutInflater.from(mContext).inflate(R.layout.card_design_group2,parent,false)

    return CardViewDesignObjectsHolderSecond2(design3)
}



override fun getItemCount(): Int {
    return veganMenuList.size

}

override fun onBindViewHolder(holder: CardViewDesignObjectsHolderSecond2, position: Int) {

    val vegan2 = veganMenuList[position]

    holder.textGroup2.text = vegan2.productName

    holder.cardgroup2.setOnClickListener {


    }
}


}