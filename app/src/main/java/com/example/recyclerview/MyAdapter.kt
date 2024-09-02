package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val booksList : ArrayList<Book>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return booksList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItems = booksList[position]
        holder.titleImg.setImageResource(currentItems.titleImage)
        holder.booktitle.text = currentItems.bookTitle
        holder.bookauthor.text = currentItems.bookAuthor
    }


    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val titleImg : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val booktitle : TextView = itemView.findViewById(R.id.tvTitle)
        val bookauthor : TextView = itemView.findViewById(R.id.tvAuthor)

    }

}