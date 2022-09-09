package com.example.veganekin.whatwouldieat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.TextView
import com.example.veganekin.R
import com.example.veganekin.firstpage.MainActivity
import com.example.veganekin.secondpage.VeganProduct
import com.example.veganekin.secondpage.VeganSecondMenu2


class EatTodayActivity() : AppCompatActivity(){
   // private var veganList:List<VeganObjects>
    private lateinit var randomText:TextView
    private lateinit var veganRecipesList:ArrayList<VeganProduct>
    public var REFRESH_INTERVAL = 5000L
    var random = 0
    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eat_today)


        randomText = findViewById(R.id.randomText)

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

        veganRecipesList = ArrayList<VeganProduct>()


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

    }

   fun startButton(view: View){
       object : CountDownTimer(2000,50){
           override fun onTick(millisUntilFinished: Long) {

               random = (0..15).shuffled().last()

                  randomText.text= veganRecipesList[random].productName

           }
           override fun onFinish() {
           }
       }.start()

        }

    fun toRecipe(view:View){
        val newIntent:Intent
        newIntent= Intent(this, MainActivity::class.java)
        this.startActivity(newIntent)

    }

    }









