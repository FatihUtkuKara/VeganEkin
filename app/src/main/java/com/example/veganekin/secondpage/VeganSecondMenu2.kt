package com.example.veganekin.secondpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.veganekin.R

class VeganSecondMenu2 : AppCompatActivity() {
    private lateinit var rvMenu2 : RecyclerView
    private lateinit var adapter: VeganProductListAdapter
    private lateinit var veganQuestionList:ArrayList<VeganProduct>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegan_second_menu2)

        var menuInfoNo = intent.getStringExtra("menuInfoNo")


        rvMenu2 = findViewById(R.id.rvMenu2)
        rvMenu2.setHasFixedSize(true)
         rvMenu2.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)


        val vegQuestion1 = VeganProduct("vegan yumurta ikameleri",1)
        val vegQuestion2 = VeganProduct("makarna vegan mı",2)
        val vegQuestion3 = VeganProduct("eser miktarfa ... içerebilir ürünleri vegan mı",3)
        val vegQuestion4 = VeganProduct("veganlar ot mu yiyor",4)
        val vegQuestion5 = VeganProduct("veganlar kahvaltıda ne yer",5)
        val vegQuestion6 = VeganProduct("veganlar proteini nereden alır",6)
        val vegQuestion7 = VeganProduct("veganlar kalsiyumu nereden alır",7)
        val vegQuestion8 = VeganProduct("giyim sektöründe kullanılan hayvansal kaynaklı malzemeler",8)


        veganQuestionList = ArrayList<VeganProduct>()


        veganQuestionList.add(vegQuestion1)
        veganQuestionList.add(vegQuestion2)
        veganQuestionList.add(vegQuestion3)
        veganQuestionList.add(vegQuestion4)
        veganQuestionList.add(vegQuestion5)
        veganQuestionList.add(vegQuestion6)
        veganQuestionList.add(vegQuestion7)
        veganQuestionList.add(vegQuestion8)


         if (menuInfoNo.equals("2")) {
            adapter = VeganProductListAdapter(this, veganQuestionList)
        }
        else if (menuInfoNo.equals("3")) {
            adapter = VeganProductListAdapter(this, veganQuestionList)
        }

        rvMenu2.adapter = adapter
    }
}