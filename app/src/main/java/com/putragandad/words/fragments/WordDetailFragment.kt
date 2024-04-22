package com.putragandad.words.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar
import com.putragandad.words.R
import com.putragandad.words.adapters.WordDetailAdapter
import com.putragandad.words.adapters.WordDetailClickListener
import com.putragandad.words.repositories.WordsRepository


class WordDetailFragment : Fragment(), WordDetailClickListener {

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
            findNavController().popBackStack()
        }

        // Setup RecyclerView
        val alphabetDetailArray = WordsRepository.getWordsDetail(words) // get words detail data based on words from bundle
        val rvAdapter = WordDetailAdapter(alphabetDetailArray, this)
        val recyclerView: RecyclerView = view.findViewById(R.id.rv_detail_words)
        recyclerView.adapter = rvAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onItemClicked(word: String) {
        intentToBrowser(word)
    }

    private fun intentToBrowser(word: String) {
        val url = "https://www.google.com/search?q=$word"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}