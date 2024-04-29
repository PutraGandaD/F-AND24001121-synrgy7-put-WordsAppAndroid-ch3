package com.putragandad.words.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import com.putragandad.words.R
import com.putragandad.words.adapters.WordListAdapter
import com.putragandad.words.adapters.WordListClickListener
import com.putragandad.words.repositories.WordsRepository
import com.putragandad.words.utils.Constant
import com.putragandad.words.utils.SharedPreferenceManager

class WordListFragment : Fragment(), WordListClickListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_word_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Get Layout Mode
        val layoutmode = SharedPreferenceManager.getLayoutMode(Constant.LAYOUT_MODE, Constant.DEFAULT_LAYOUT_MODE)

        // Setup Material Toolbar
        val topappbar : MaterialToolbar = view.findViewById(R.id.topAppBarList)

        // Setup RecyclerView
        val recyclerView: RecyclerView = view.findViewById(R.id.rv_words_vertical)
        setUpRecyclerView(recyclerView)
        setUpLayoutMode(recyclerView, layoutmode, topappbar)

        //Toast.makeText(requireActivity(), "$layoutmode", Toast.LENGTH_SHORT).show()

        // menu item click listener for topappbar
        topappbar.setOnMenuItemClickListener { menuItem ->
            val layoutmode = SharedPreferenceManager.getLayoutMode(Constant.LAYOUT_MODE, Constant.DEFAULT_LAYOUT_MODE)
            when(menuItem.itemId) {
                R.id.list_mode -> {
                    switchLayoutMode(recyclerView, layoutmode, menuItem)
                    true
                }
                else -> false
            }
        }
    }

    override fun onItemClicked(word: String) {
        val bundle = bundleOf(EXTRA_DATA to word) // use bundle to pass word to WordDetailFragment
        view?.let { Navigation.findNavController(it).navigate(R.id.action_wordListFragment_to_wordDetailFragment, bundle) }
    }

    private fun setUpRecyclerView(rv: RecyclerView) {
        val rvAdapter = WordListAdapter(WordsRepository.getWordsList(), this)
        rv.adapter = rvAdapter
    }

    private fun setUpLayoutMode(rv: RecyclerView, layoutMode: String, topappbar: MaterialToolbar) {
        when(layoutMode) {
            "vertical" -> {
                rv.layoutManager = LinearLayoutManager(requireContext())
                topappbar.menu.findItem(R.id.list_mode).setIcon(R.drawable.ic_table_rows_24)
            }
            "grid" -> {
                rv.layoutManager = GridLayoutManager(requireContext(), 3)
                topappbar.menu.findItem(R.id.list_mode).setIcon(R.drawable.ic_view_module_24)
            }
            else -> false
        }
    }

    private fun switchLayoutMode(rv: RecyclerView, layoutMode: String, menuItem: MenuItem) {
        when(layoutMode) {
            "vertical" -> {
                rv.layoutManager = GridLayoutManager(requireContext(), 3)
                SharedPreferenceManager.saveLayoutMode(Constant.LAYOUT_MODE, "grid")
                menuItem.setIcon(R.drawable.ic_view_module_24) // set icon to grid
            }
            "grid" -> {
                rv.layoutManager = LinearLayoutManager(requireContext())
                SharedPreferenceManager.saveLayoutMode(Constant.LAYOUT_MODE, "vertical")
                menuItem.setIcon(R.drawable.ic_table_rows_24) // set icon to vertical
            }
            else -> false
        }
    }

    companion object {
        val EXTRA_DATA = "EXTRA_DATA"
    }
}