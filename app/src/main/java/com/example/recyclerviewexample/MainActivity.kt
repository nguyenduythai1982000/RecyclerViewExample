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
        listData.add(Food(3,"Bánh mì","Bánh mì thập cẩm",true,5, reviewCount = 10, R.drawable.banhmi))

        val adapter: AdapterFood= AdapterFood()
        adapter.setData(listData)
        recyclerView.adapter= adapter
        recyclerView.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }
}