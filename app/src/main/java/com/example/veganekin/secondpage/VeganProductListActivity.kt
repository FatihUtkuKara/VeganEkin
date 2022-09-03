package com.example.veganekin.secondpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.veganekin.R

class VeganProductListActivity : AppCompatActivity() {
    private lateinit var rv : RecyclerView

    private lateinit var veganEntertainmentList:ArrayList<VeganProduct>
    private lateinit var veganProductList:ArrayList<VeganProduct>
    private lateinit var veganJustList:ArrayList<VeganProduct>
    private lateinit var adapter: VeganProductListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegan_product_list)


        var menuInfoNo = intent.getStringExtra("menuInfoNo")


        rv = findViewById(R.id.rv)
        rv.setHasFixedSize(true)
        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)



        val vegJust1 = VeganProduct("sadece patates değil",1)
        val vegJust2 = VeganProduct("sadece yeşil mercimek değil",2)
        val vegJust3 = VeganProduct("sadece tofu değil",3)
        val vegJust4 = VeganProduct("sadece nohut değil",4)

        val vegEnt1 = VeganProduct("vegan yaşamı kolaylaştıracak mobil uygulamalar", 1)
        val vegEnt2 = VeganProduct("vegan yaşamı anlamak ve uygulamak için okuyabileceğiniz kitaplar", 2)
        val vegEnt3 = VeganProduct("hayvansal ürün tüketimini sorgulatacak belgesel ve filmler", 3)
        val vegEnt4 = VeganProduct("veganlıkla ilgili içerik üreten youtube kanalları", 4)
        val vegEnt5 = VeganProduct("veganlıkla ilgili içerik üreten instagram hesapları", 5)
        val vegEnt6 = VeganProduct("internet siteleri", 6)



        val v1 = VeganProduct("vegan donmuş gıdalar ", 1)
        val v2 = VeganProduct("vegan kahvaltılıklar", 2)
        val v3 = VeganProduct("vegan et ürünleri", 3)
        val v4 = VeganProduct("vegan kahvaltılık gevrekler", 4)
        val v5 = VeganProduct("vegan sütler", 5)
        val v6 = VeganProduct("vegan peynirler", 6)
        val v7 = VeganProduct("vegan pasta malzemeleri", 7)
        val v8 = VeganProduct("vegan bisküviler", 8)
        val v9 = VeganProduct("vegan çikolatalar", 9)
        val v10 = VeganProduct("vegan krakerler", 10)
        val v11 = VeganProduct("vegan cipsler", 11)
        val v12 = VeganProduct("vegan börekler", 12)
        val v13 = VeganProduct("vegan soslar", 13)
        val v14 = VeganProduct("vegan jelibonlar", 14)
        val v15 = VeganProduct("vegan yağlar", 15)
        val v16 = VeganProduct("vegan gofretler", 16)

        veganEntertainmentList = ArrayList<VeganProduct>()
        veganProductList = ArrayList<VeganProduct>()
        veganJustList = ArrayList<VeganProduct>()

        veganJustList.add(vegJust1)
        veganJustList.add(vegJust2)
        veganJustList.add(vegJust3)
        veganJustList.add(vegJust4)

        veganEntertainmentList.add(vegEnt1)
        veganEntertainmentList.add(vegEnt2)
        veganEntertainmentList.add(vegEnt3)
        veganEntertainmentList.add(vegEnt4)
        veganEntertainmentList.add(vegEnt5)
        veganEntertainmentList.add(vegEnt6)

        veganProductList.add(v1)
        veganProductList.add(v2)
        veganProductList.add(v3)
        veganProductList.add(v4)
        veganProductList.add(v5)
        veganProductList.add(v6)
        veganProductList.add(v7)
        veganProductList.add(v8)
        veganProductList.add(v9)
        veganProductList.add(v10)
        veganProductList.add(v11)
        veganProductList.add(v12)
        veganProductList.add(v13)
        veganProductList.add(v14)
        veganProductList.add(v15)
        veganProductList.add(v16)




        if (menuInfoNo.equals("1") ) {
            adapter = VeganProductListAdapter(this, veganProductList)
        }


        else if (menuInfoNo.equals("4")) {
            adapter = VeganProductListAdapter(this, veganEntertainmentList)
        }
        else if(menuInfoNo.equals("8")) {
            adapter = VeganProductListAdapter(this, veganJustList)
        }

        rv.adapter = adapter

    }
    }

