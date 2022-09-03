package com.example.veganekin.lastpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.veganekin.R
import com.example.veganekin.secondpage.VeganProduct
import com.example.veganekin.secondpage.VeganProductListAdapter

class VeganLastPageActivity : AppCompatActivity() {
    private lateinit var rv3 : RecyclerView
    private lateinit var veganLastPageList:ArrayList<LastVeganProduct>
    private lateinit var adapter : LastPageAdapter

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegan_last_page)

//bu sayfaya ikinci sayffadan gelirken(veganProductListAdapter sayfası içerisinde) intentle birlikte sayfanın bilgisi de gönderilmeli ve o sayede hangi sayfada olduğuna göre if else yapısıyla beraber listeler eklenmeli.
            var menuInfoNo = intent.getStringExtra("menuInfoNo")
//geldi
            rv3 = findViewById(R.id.rv3)
            rv3.setHasFixedSize(true)
            rv3.layoutManager=StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)


            val westFalafel= LastVeganProduct("westFalafel",1,"westfalafel")
            val feasthalka = LastVeganProduct("feasthalka",2,"feasthalka")
            val kaplanlarfalafel = LastVeganProduct("kaplanlarfalafel",3,"kaplanlarfalafel")
            val pinarfalafel = LastVeganProduct("pinarfalafel",4,"pinarfalafel")
            val veggyschnitzel = LastVeganProduct("veggyschnitzel",5,"veggyschnitzel")
            val bcfalafel = LastVeganProduct("bcfalafel",6,"bcfalafel")
            val bcschnitzel = LastVeganProduct("bcschnitzel",7,"bcschnitzel")
            val dolcoeda = LastVeganProduct("dolcoeda",8,"dolcoeda")
            val feastbarbunya = LastVeganProduct("feastbarbunya",9,"feastbarbunya")
            val feastbrokoli = LastVeganProduct("feastbrokoli",10,"feastbrokoli")
            val feastfasulye = LastVeganProduct("feastfasulye",11,"feastfasulye")
            val feastmilfoy = LastVeganProduct("feastmilfoy",12,"feastmilfoy")
            val feastmisir = LastVeganProduct("feastmisir",13,"feastmisir")
            val feastpatates = LastVeganProduct("feastpatates",14,"feastpatates")
            val incihalka = LastVeganProduct("incihalka",15,"incihalka")
            val metrogarnitur = LastVeganProduct("metrogarnitur",16,"metrogarnitur")
            val metroiclikofte = LastVeganProduct("metroiclikofte",17,"metroiclikofte")
            val metrolahmacun = LastVeganProduct("metrolahmacun",18,"metrolahmacun")
            val metropatates = LastVeganProduct("metropatates",19,"metropatates")
            val metrosebze = LastVeganProduct("metrosebze",20,"metrosebze")
            val movingburger = LastVeganProduct("movingburger",21,"movingburger")
            val movingpide = LastVeganProduct("movingpide",22,"movingpide")
            val nimetmilfoy = LastVeganProduct("nimetmilfoy",23,"nimetmilfoy")
            val pinarmilfoy = LastVeganProduct("pinarmilfoy",24,"pinarmilfoy")
            val pinarsebzekofte = LastVeganProduct("pinarsebzekofte",25,"pinarsebzekofte")
            val planetpower = LastVeganProduct("planetpower",26,"planetpower")
            val quornfillets = LastVeganProduct("quornfillets",27,"quornfillets")
            val quornfingers = LastVeganProduct("quornfingers",28,"quornfingers")
            val quornnuggets = LastVeganProduct("quornnuggets",29,"quornnuggets")
            val riobabrownie = LastVeganProduct("riobabrownie",30,"riobabrownie")
            val savethenatureburger = LastVeganProduct("savethenatureburger",31,"savethenatureburger")
            val savethenaturekebap = LastVeganProduct("savethenaturekebap",32,"savethenaturekebap")
            val superfreshbezelye = LastVeganProduct("superfreshbezelye",33,"superfreshbezelye")
            val superfreshfalafel = LastVeganProduct("superfreshfalafel",34,"superfreshfalafel")
            val superfreshgarnit = LastVeganProduct("superfreshgarnit",35,"superfreshgarnit")
            val superfreshispanak = LastVeganProduct("superfreshispanak",36,"superfreshispanak")
            val superfreshmilfoy = LastVeganProduct("superfreshmilfoy",37,"superfreshmilfoy")
            val superfreshpatates = LastVeganProduct("superfreshpatates",38,"superfreshpatates")
            val superfreshpatates2 = LastVeganProduct("superfreshpatates2",39,"superfreshpatates2")
            val tokanaiclikofte = LastVeganProduct("tokanaiclikofte",40,"tokanaiclikofte")
            val tokanalahmacun = LastVeganProduct("tokanalahmacun",41,"tokanalahmacun")
            val tokanamanti = LastVeganProduct("tokanamanti",42,"tokanamanti")
            val vegburger = LastVeganProduct("vegburger",43,"vegburger")
            val vegetableballs = LastVeganProduct("vegetableballs",44,"vegetableballs")
            val veggyburger = LastVeganProduct("veggyburger",45,"veggyburger")




            veganLastPageList = ArrayList<LastVeganProduct>()

            veganLastPageList.add(westFalafel)
            veganLastPageList.add(feasthalka)
            veganLastPageList.add(kaplanlarfalafel)
            veganLastPageList.add(pinarfalafel)
            veganLastPageList.add(bcfalafel)
            veganLastPageList.add(bcschnitzel)
            veganLastPageList.add(dolcoeda)
            veganLastPageList.add(feastbarbunya)
            veganLastPageList.add(feastbrokoli)
            veganLastPageList.add(feastfasulye)
            veganLastPageList.add(feastmilfoy)
            veganLastPageList.add(feastmisir)
            veganLastPageList.add(feastpatates)
            veganLastPageList.add(incihalka)
            veganLastPageList.add(metrogarnitur)
            veganLastPageList.add(metroiclikofte)
            veganLastPageList.add(metrolahmacun)
            veganLastPageList.add(metropatates)
            veganLastPageList.add(metrosebze)
            veganLastPageList.add(movingburger)
            veganLastPageList.add(movingpide)
            veganLastPageList.add(nimetmilfoy)
            veganLastPageList.add(pinarmilfoy)
            veganLastPageList.add(pinarsebzekofte)
            veganLastPageList.add(planetpower)
            veganLastPageList.add(quornfillets)
            veganLastPageList.add(quornfingers)
            veganLastPageList.add(quornnuggets)
            veganLastPageList.add(riobabrownie)
            veganLastPageList.add(savethenatureburger)
            veganLastPageList.add(savethenaturekebap)
            veganLastPageList.add(superfreshbezelye)
            veganLastPageList.add(superfreshfalafel)
            veganLastPageList.add(superfreshgarnit)
            veganLastPageList.add(superfreshispanak)
            veganLastPageList.add(superfreshmilfoy)
            veganLastPageList.add(superfreshpatates)
            veganLastPageList.add(superfreshpatates2)
            veganLastPageList.add(tokanaiclikofte)
            veganLastPageList.add(tokanalahmacun)
            veganLastPageList.add(tokanamanti)
            veganLastPageList.add(vegburger)
            veganLastPageList.add(vegetableballs)
            veganLastPageList.add(veggyburger)
            veganLastPageList.add(veggyschnitzel)


            adapter = LastPageAdapter(this,veganLastPageList)
            rv3.adapter = adapter


    }
}