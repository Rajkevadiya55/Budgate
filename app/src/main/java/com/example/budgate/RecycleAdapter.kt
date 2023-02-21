package com.example.budgate

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class RecycleAdapter(list:ArrayList<BudgetModel>):
    RecyclerView.Adapter<RecycleAdapter.BudgetHolder>() {

    var list=list
    class BudgetHolder(itemView:View):ViewHolder(itemView) {

        var p_method=itemView.findViewById<TextView>(R.id.recycle_p_method)
        var income = itemView.findViewById<TextView>(R.id.recycle_income)
        var expense = itemView.findViewById<TextView>(R.id.recycle_expense)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BudgetHolder {
       return  BudgetHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycle_budgate,parent,false))
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onBindViewHolder(holder: BudgetHolder, position: Int) {


        holder.p_method.text=list[position].p_method
        holder.income.text=list[position].income.toString()
        holder.expense.text=list[position].expense.toString()
    }
}