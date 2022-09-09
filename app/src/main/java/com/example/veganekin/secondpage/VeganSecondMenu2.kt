package com.example.veganekin.secondpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.veganekin.R

class VeganSecondMenu2 : AppCompatActivity() {
    private lateinit var rvMenu2 : RecyclerView
    private lateinit var adapter: VeganSecondMenu2Adapter
    private lateinit var veganQuestionList:ArrayList<VeganProduct>
    public lateinit var veganRecipesList:ArrayList<VeganProduct>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegan_second_menu2)

        var menuInfoNo = intent.getStringExtra("menuInfoNo")


        rvMenu2 = findViewById(R.id.rvMenu2)
        rvMenu2.setHasFixedSize(true)
         rvMenu2.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)


        val vegQuestion1 = VeganProduct("vegan yumurta ikameleri",17)
        val vegQuestion2 = VeganProduct("makarna vegan mı",18)
        val vegQuestion3 = VeganProduct("eser miktarfa ... içerebilir ürünleri vegan mı",19)
        val vegQuestion4 = VeganProduct("veganlar ot mu yiyor",20)
        val vegQuestion5 = VeganProduct("veganlar kahvaltıda ne yer",21)
        val vegQuestion6 = VeganProduct("veganlar proteini nereden alır",22)
        val vegQuestion7 = VeganProduct("veganlar kalsiyumu nereden alır",23)
        val vegQuestion8 = VeganProduct("giyim sektöründe kullanılan hayvansal kaynaklı malzemeler",24)

        val vegRecipes1 = VeganProduct("nohut unlu omlet",25)
        val vegRecipes2 = VeganProduct("yeşil mercimek köftesi",26)
        val vegRecipes3 = VeganProduct("falafel",27)
        val vegRecipes4 = VeganProduct("krep",28)
        val vegRecipes5 = VeganProduct("pankek",29)
        val vegRecipes6 = VeganProduct("mercimek salatası",30)
        val vegRecipes7 = VeganProduct("pratik mantı",31)
        val vegRecipes8 = VeganProduct("humus",32)
        val vegRecipes9 = VeganProduct("biberli ekmek",33)
        val vegRecipes10 = VeganProduct("tofulu menemen",34)
        val vegRecipes11 = VeganProduct("brownie",35)
        val vegRecipes12 = VeganProduct("kabak köftesi",36)
        val vegRecipes13 = VeganProduct("mücver",37)
        val vegRecipes14 = VeganProduct("hamburger",38)
        val vegRecipes15 = VeganProduct("çıtır nohut salatası",39)
        val vegRecipes16 = VeganProduct("sebzeli tofu",40)
        val vegRecipes17 = VeganProduct("kahvaltılık wrap",41)
        val vegRecipes18 = VeganProduct("yulaf sütü",42)
        val vegRecipes19 = VeganProduct("badem sütü",43)
        val vegRecipes20 = VeganProduct("kaju yoğurdu",44)
        val vegRecipes21 = VeganProduct("kaju ayranı",45)
        val vegRecipes22 = VeganProduct("cacık",46)
        val vegRecipes23 = VeganProduct("mercimekli börek",47)
        val vegRecipes24 = VeganProduct("tantuni",48)
        val vegRecipes25 = VeganProduct("lahmacun",49)
        val vegRecipes26 = VeganProduct("şinitzel",50)
        val vegRecipes27 = VeganProduct("nohutlu bulgurlu köfte",51)
        val vegRecipes28 = VeganProduct("chocolate chip cookie",52)
        val vegRecipes29 = VeganProduct("vegan yumurtalı ekmek",53)
        val vegRecipes30 = VeganProduct("kebap",54)
        val vegRecipes31 = VeganProduct("yaş pasta",55)
        val vegRecipes32 = VeganProduct("vegan sucuk",56)
        val vegRecipes33 = VeganProduct("vegan kek",57)
        val vegRecipes34 = VeganProduct("mantı",58)
        val vegRecipes35 = VeganProduct("pizza",59)
        val vegRecipes36 = VeganProduct("kokoreç",60)
        val vegRecipes37 = VeganProduct("soya kıymalı makarna",61)
        val vegRecipes38 = VeganProduct("sushi",62)
        val vegRecipes39 = VeganProduct("gözleme",63)
        val vegRecipes40 = VeganProduct("soya köftesi",64)
        val vegRecipes41 = VeganProduct("sebze köftesi",65)
        val vegRecipes42 = VeganProduct("izmir bomba",66)
        val vegRecipes43 = VeganProduct("enginar",67)


        veganQuestionList = ArrayList<VeganProduct>()
        veganRecipesList = ArrayList<VeganProduct>()

        veganQuestionList.add(vegQuestion1)
        veganQuestionList.add(vegQuestion2)
        veganQuestionList.add(vegQuestion3)
        veganQuestionList.add(vegQuestion4)
        veganQuestionList.add(vegQuestion5)
        veganQuestionList.add(vegQuestion6)
        veganQuestionList.add(vegQuestion7)
        veganQuestionList.add(vegQuestion8)

        veganRecipesList.add(vegRecipes1)
        veganRecipesList.add(vegRecipes2)
        veganRecipesList.add(vegRecipes3)
        veganRecipesList.add(vegRecipes4)
        veganRecipesList.add(vegRecipes5)
        veganRecipesList.add(vegRecipes6)
        veganRecipesList.add(vegRecipes7)
        veganRecipesList.add(vegRecipes8)
        veganRecipesList.add(vegRecipes9)
        veganRecipesList.add(vegRecipes10)
        veganRecipesList.add(vegRecipes11)
        veganRecipesList.add(vegRecipes12)
        veganRecipesList.add(vegRecipes13)
        veganRecipesList.add(vegRecipes14)
        veganRecipesList.add(vegRecipes15)
        veganRecipesList.add(vegRecipes16)
        veganRecipesList.add(vegRecipes17)
        veganRecipesList.add(vegRecipes18)
        veganRecipesList.add(vegRecipes19)
        veganRecipesList.add(vegRecipes20)
        veganRecipesList.add(vegRecipes21)
        veganRecipesList.add(vegRecipes22)
        veganRecipesList.add(vegRecipes23)
        veganRecipesList.add(vegRecipes24)
        veganRecipesList.add(vegRecipes25)
        veganRecipesList.add(vegRecipes26)
        veganRecipesList.add(vegRecipes27)
        veganRecipesList.add(vegRecipes28)
        veganRecipesList.add(vegRecipes29)
        veganRecipesList.add(vegRecipes30)
        veganRecipesList.add(vegRecipes31)
        veganRecipesList.add(vegRecipes32)
        veganRecipesList.add(vegRecipes33)
        veganRecipesList.add(vegRecipes34)
        veganRecipesList.add(vegRecipes35)
        veganRecipesList.add(vegRecipes36)
        veganRecipesList.add(vegRecipes37)
        veganRecipesList.add(vegRecipes38)
        veganRecipesList.add(vegRecipes39)
        veganRecipesList.add(vegRecipes40)
        veganRecipesList.add(vegRecipes41)
        veganRecipesList.add(vegRecipes42)
        veganRecipesList.add(vegRecipes43)




        if (menuInfoNo.equals("2")) {
            adapter = VeganSecondMenu2Adapter(this, veganQuestionList)
        }
        else if (menuInfoNo.equals("3")) {
            adapter = VeganSecondMenu2Adapter(this, veganRecipesList)
        }

        rvMenu2.adapter = adapter
    }
}