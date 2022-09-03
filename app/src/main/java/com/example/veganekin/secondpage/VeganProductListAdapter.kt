package com.example.veganekin.secondpage

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.veganekin.R
import com.example.veganekin.lastpage.VeganLastPageActivity

class VeganProductListAdapter(private val mContext: Context, private val veganProductList:List<VeganProduct>)
    : RecyclerView.Adapter<VeganProductListAdapter.CardViewDesignObjectsHolderProducts>() {
    inner class CardViewDesignObjectsHolderProducts(view: View): RecyclerView.ViewHolder(view){

        var productCardView: CardView
        var productTextView: TextView

        init {
                productCardView = view.findViewById(R.id.productCardView)
                productTextView = view.findViewById(R.id.productText)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectsHolderProducts {

        val design2 = LayoutInflater.from(mContext).inflate(R.layout.card_design_product,parent,false)
        return CardViewDesignObjectsHolderProducts(design2)
    }



    override fun getItemCount(): Int {
        return veganProductList.size

    }

    override fun onBindViewHolder(holder: CardViewDesignObjectsHolderProducts, position: Int) {

        val vegan2 = veganProductList[position]

        holder.productTextView.text = vegan2.productName

        holder.productCardView.setOnClickListener {
            val newIntent: Intent
            newIntent = Intent(mContext, VeganLastPageActivity::class.java)
            newIntent.putExtra("menuInfoNo",vegan2.menuInfoNo.toString())
            mContext.startActivity(newIntent)


        }
    }


}