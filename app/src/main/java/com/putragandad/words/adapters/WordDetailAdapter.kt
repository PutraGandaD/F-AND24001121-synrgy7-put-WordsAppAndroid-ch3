package com.putragandad.words.adapters

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.putragandad.words.R

class WordDetailAdapter(private val dataSet: MutableList<String>) : RecyclerView.Adapter<WordDetailAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val words = view.findViewById<TextView>(R.id.tv_card_word_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.words_detail_item_rv, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val current = dataSet.get(position) // get data
        val context = holder.itemView.context // get context
        holder.words.text = current

        holder.itemView.setOnClickListener {
            val url = "https://www.google.com/search?q=$current"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            context.startActivity(intent)
        }
    }
}