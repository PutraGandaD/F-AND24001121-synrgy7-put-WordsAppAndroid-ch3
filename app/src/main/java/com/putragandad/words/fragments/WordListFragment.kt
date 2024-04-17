package com.putragandad.words.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import com.putragandad.words.R
import com.putragandad.words.adapters.WordListAdapter

class WordListFragment : Fragment() {
    private var layoutmode = "vertical" // helper variable for detecting layout mode

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_word_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // generate alphabet a to z and convert it to array
        val alphabetArray = ('A'..'Z').map { it.toString() }.toTypedArray()

        val rvAdapter = WordListAdapter(alphabetArray)

        val recyclerView: RecyclerView = view.findViewById(R.id.rv_words_vertical)
        recyclerView.adapter = rvAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val topappbar : MaterialToolbar = view.findViewById(R.id.topAppBarList)

        // menu item click listener for topappbar
        topappbar.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId) {
                R.id.list_mode -> {
                    when(layoutmode) {
                        "vertical" -> {
                            recyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
                            layoutmode = "grid"
                            menuItem.setIcon(R.drawable.ic_view_module_24) // set icon to grid
                        }
                        "grid" -> {
                            recyclerView.layoutManager = LinearLayoutManager(requireContext())
                            layoutmode = "vertical"
                            menuItem.setIcon(R.drawable.ic_table_rows_24) // set icon to vertical
                        }
                        else -> false
                    }

                    true
                }
                else -> false
            }
        }
    }
}