package com.putragandad.words.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import com.putragandad.words.R
import com.putragandad.words.adapters.WordDetailAdapter
import com.putragandad.words.data.WordsConstantData


class WordDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_word_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val topAppBar : MaterialToolbar = view.findViewById(R.id.topAppBarDetail)
        val words = arguments?.getString(WordListFragment.EXTRA_DATA) // get bundle

        topAppBar.title = "Words That Start With $words" // set top app bar title

        // handle navigation icon onclick
        topAppBar.setNavigationOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_wordDetailFragment_to_wordListFragment)
        }

        val alphabetDetailArray = WordsConstantData.getWordsDetail(words) // get words detail data based on words from bundle
        val rvAdapter = WordDetailAdapter(alphabetDetailArray)
        val recyclerView: RecyclerView = view.findViewById(R.id.rv_detail_words)
        recyclerView.adapter = rvAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
}