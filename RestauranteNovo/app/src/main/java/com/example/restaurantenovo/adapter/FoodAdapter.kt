package com.example.restaurantenovo.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantenovo.model.Food

class FoodAdapter(private val context: Context, private val foodList: MutableList<Food>): RecyclerView.Adapter<FoodAdapter.FoodViewHolder>(){

    inner class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}