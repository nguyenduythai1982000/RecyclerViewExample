package com.example.recyclerviewexample

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        val listData: ArrayList<Food> = ArrayList()
        listData.add(Food(1,"Bánh mì","Bánh mì gà",true,3, reviewCount = 10, R.drawable.banhmi))
        listData.add(Food(2,"Bánh mì","Bánh mì bò",true,5, reviewCount = 10, R.drawable.banhmi))
        listData.add(Food(3,"Bánh mì","Bánh mì thập cẩm",true,5, reviewCount = 100, R.drawable.banhmi))
        listData.add(Food(4,"Cơm tấm","Cơm sườn",true,5, reviewCount = 100, R.drawable.comsuon))
        listData.add(Food(5,"Cơm tấm","Cơm sườn bì chả",true,5, reviewCount = 50, R.drawable.suonbicha))
        listData.add(Food(6,"Phở","Phở bò",true,5, reviewCount = 100, R.drawable.pho_bo))
        listData.add(Food(7,"Bánh cuốn","Bánh cuốn",true,4, reviewCount = 100, R.drawable.banhcuon))
        listData.add(Food(8,"Bánh xèo","Bánh xèo miền trung",true,4, reviewCount = 100, R.drawable.banh_xwo))


        val adapter: AdapterFood= AdapterFood()
        adapter.setData(listData)
        recyclerView.adapter= adapter
        recyclerView.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }
}