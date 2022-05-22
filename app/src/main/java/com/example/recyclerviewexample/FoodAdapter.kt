package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_layout.view.*


class AdapterFood: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var listData: List<Food> = ArrayList()
    public fun setData(listData: List<Food>){
        this.listData= listData
    }

    override fun getItemCount(): Int {
        return listData.size // trả về số lượng có trong list
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AdapterFoodHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is AdapterFoodHolder){
            holder.bindingData(listData.get(position))
        }
    }
    public class AdapterFoodHolder constructor(itemView: View):
        RecyclerView.ViewHolder(itemView)
    {
        private val imgFood: ImageView= itemView.imgFood
        private val txtTitle: TextView= itemView.txtFoodTitle
        private val tvFoodName: TextView= itemView.txtFoodName
        private val imgStar1: ImageView= itemView.imgStar1
        private val imgStar2: ImageView= itemView.imgStar2
        private val imgStar3: ImageView= itemView.imgStar3
        private val imgStar4: ImageView= itemView.imgStar4
        private val imgStar5: ImageView= itemView.imgStar5
        private val txtRating: TextView= itemView.txtRating
        private val txtReview: TextView? = itemView.txtViewCount

        fun bindingData(food: Food)
        {
            imgFood.setImageResource(food.imgRes)
            txtTitle.text= food.title
            tvFoodName.text= food.subTitle
            txtRating.text= food.ratingCount.toString()
            txtReview!!.text= "(${food.reviewCount} reviews)"

            when(food.ratingCount){
                1 -> {
                    imgStar1.setImageResource(R.drawable.star_check)
                }
                2 -> {
                    imgStar1.setImageResource(R.drawable.star_check)
                    imgStar2.setImageResource(R.drawable.star_check)
                }
                3 -> {
                    imgStar1.setImageResource(R.drawable.star_check)
                    imgStar2.setImageResource(R.drawable.star_check)
                    imgStar3.setImageResource(R.drawable.star_check)
                }
                4 -> {
                    imgStar1.setImageResource(R.drawable.star_check)
                    imgStar2.setImageResource(R.drawable.star_check)
                    imgStar3.setImageResource(R.drawable.star_check)
                    imgStar4.setImageResource(R.drawable.star_check)

                }
                5 -> {
                    imgStar1.setImageResource(R.drawable.star_check)
                    imgStar2.setImageResource(R.drawable.star_check)
                    imgStar3.setImageResource(R.drawable.star_check)
                    imgStar4.setImageResource(R.drawable.star_check)
                    imgStar5.setImageResource(R.drawable.star_check)

                }
            }
        }

    }


}