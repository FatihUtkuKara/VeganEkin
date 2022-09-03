package com.example.veganekin.whatwouldieat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import com.example.veganekin.R
import com.example.veganekin.secondpage.VeganProduct


class EatTodayActivity() : AppCompatActivity(){
   // private var veganList:List<VeganObjects>
    private lateinit var randomText:TextView
    private lateinit var veganProList:ArrayList<VeganProduct>
    public var REFRESH_INTERVAL = 5000L
    var random = 0
    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eat_today)

        randomText = findViewById(R.id.randomText)

        val vw1 = VeganProduct("vegan donmuş gıdalar ", 1)
        val vw2 = VeganProduct("vegan kahvaltılıklar", 2)
        val vw3 = VeganProduct("vegan et ürünleri", 3)
        val vw4 = VeganProduct("vegan kahvaltılık gevrekler", 4)
        val vw5 = VeganProduct("vegan sütler", 5)
        val vw6 = VeganProduct("vegan peynirler", 6)
        val vw7 = VeganProduct("vegan pasta malzemeleri", 7)
        val vw8 = VeganProduct("vegan bisküviler", 8)
        val vw9 = VeganProduct("vegan çikolatalar", 9)
        val vw10 = VeganProduct("vegan krakerler", 10)
        val vw11 = VeganProduct("vegan cipsler", 11)
        val vw12 = VeganProduct("vegan börekler", 12)
        val vw13 = VeganProduct("vegan soslar", 13)
        val vw14 = VeganProduct("vegan jelibonlar", 14)
        val vw15 = VeganProduct("vegan yağlar", 15)
        val vw16 = VeganProduct("vegan gofretler", 16)

        veganProList = ArrayList<VeganProduct>()

        veganProList.add(vw1)
        veganProList.add(vw2)
        veganProList.add(vw3)
        veganProList.add(vw4)
        veganProList.add(vw5)
        veganProList.add(vw6)
        veganProList.add(vw7)
        veganProList.add(vw8)
        veganProList.add(vw9)
        veganProList.add(vw10)
        veganProList.add(vw11)
        veganProList.add(vw12)
        veganProList.add(vw13)
        veganProList.add(vw14)
        veganProList.add(vw15)
        veganProList.add(vw16)

    }

   fun startGame2(view: View){
       object : CountDownTimer(2000,50){
           override fun onTick(millisUntilFinished: Long) {

               random = (0..15).shuffled().last()

                  randomText.text= veganProList[random].productName




           }

           override fun onFinish() {
           }
       }.start()



        //for(i  in 0..16){

           // Log.e("nedir",)
            //randomText.setText(i)
          //      randomText.text= (veganProList[i].productName );
            //    Thread.sleep(500L)
                //randomText.setText(i.productName.toString())

        }

    }









