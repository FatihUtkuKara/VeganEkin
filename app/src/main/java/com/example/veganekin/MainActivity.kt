package com.example.veganekin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var rv2 : RecyclerView
    private lateinit var veganObjectsList:ArrayList<VeganObjects>
    private lateinit var adapter:RvAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv2 = findViewById(R.id.rv2)
        rv2.setHasFixedSize(true)
        rv2.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        val vm1 = VeganObjects("vegan ürün listeleri",1)
        val vm2 = VeganObjects("veganlıkla ilgili sık sorulanlar",2)
        val vm3 = VeganObjects("vegan yemek tarifleri",3)
        val vm4 = VeganObjects("film,kitap,sosyal,medya hesabı önerileri",4)
        val vm5 = VeganObjects("bugün ne yesem?",5)
        val vm6 = VeganObjects("veganlık nedir?",6)
        val vm7 = VeganObjects("vegan calculator",7)
        val vm8 = VeganObjects("sadece ..... değil",8)
        /*val vm9 = VeganObjects("vegan bisküviler",9)
        val vm10 = VeganObjects("veganlıkla alakalı filmler",10)
        val vm11 = VeganObjects("veganlıkla cipsler",11)
        val vm12 = VeganObjects("vegan youtube kanalları",12) */

        veganObjectsList = ArrayList<VeganObjects>()

        veganObjectsList.add(vm1)
        veganObjectsList.add(vm2)
        veganObjectsList.add(vm3)
        veganObjectsList.add(vm4)
        veganObjectsList.add(vm5)
        veganObjectsList.add(vm6)
        veganObjectsList.add(vm7)
        veganObjectsList.add(vm8)
     /*   veganObjectsList.add(vm9)
        veganObjectsList.add(vm10)
        veganObjectsList.add(vm11)
        veganObjectsList.add(vm12) */

        adapter = RvAdapter(this,veganObjectsList)
        rv2.adapter = adapter



    }
}