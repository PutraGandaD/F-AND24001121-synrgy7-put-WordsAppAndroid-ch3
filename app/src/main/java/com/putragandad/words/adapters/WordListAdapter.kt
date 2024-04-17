package com.putragandad.words.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.putragandad.words.R

class WordListAdapter(private val dataSet: Array<String>, private val onItemClickListener: WordListClickListener) : RecyclerView.Adapter<WordListAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val words = view.findViewById<TextView>(R.id.tv_card_word)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.words_list_item_rv, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val current = dataSet.get(position) // get data
        holder.words.text = current // set text

        val wordsCard = holder.itemView.findViewById<MaterialCardView>(R.id.card_word_list)

        wordsCard.setOnClickListener {
            onItemClickListener.onItemClicked(current)
        }
    }
}

interface WordListClickListener {
    fun onItemClicked(word: String)
}

