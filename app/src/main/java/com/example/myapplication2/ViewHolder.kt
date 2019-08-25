package com.example.myapplication2

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_user.view.*

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvUserName: TextView = view.tv_user_name
}