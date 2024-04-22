package com.putragandad.words.repositories

import com.putragandad.words.data.WordsConstantData

object WordsRepository {
    fun getWordsList() : MutableList<String> {
        return WordsConstantData.alphabetArray
    }

    fun getWordsDetail(words: String?) : List<String> {
        val wordsDetail = when(words) {
            "A" -> {
                WordsConstantData.WordsDetail.A.wordsDetailList
            }
            "B" -> {
                WordsConstantData.WordsDetail.B.wordsDetailList
            }
            "C" -> {
                WordsConstantData.WordsDetail.C.wordsDetailList
            }
            "D" -> {
                WordsConstantData.WordsDetail.D.wordsDetailList
            }
            "E" -> {
                WordsConstantData.WordsDetail.E.wordsDetailList
            }
            "F" -> {
                WordsConstantData.WordsDetail.F.wordsDetailList
            }
            "G" -> {
                WordsConstantData.WordsDetail.G.wordsDetailList
            }
            "H" -> {
                WordsConstantData.WordsDetail.H.wordsDetailList
            }
            "I" -> {
                WordsConstantData.WordsDetail.I.wordsDetailList
            }
            "J" -> {
                WordsConstantData.WordsDetail.J.wordsDetailList
            }
            "K" -> {
                WordsConstantData.WordsDetail.K.wordsDetailList
            }
            "L" -> {
                WordsConstantData.WordsDetail.L.wordsDetailList
            }
            "M" -> {
                WordsConstantData.WordsDetail.M.wordsDetailList
            }
            "N" -> {
                WordsConstantData.WordsDetail.N.wordsDetailList
            }
            "O" -> {
                WordsConstantData.WordsDetail.O.wordsDetailList
            }
            "P" -> {
                WordsConstantData.WordsDetail.P.wordsDetailList
            }
            "Q" -> {
                WordsConstantData.WordsDetail.Q.wordsDetailList
            }
            "R" -> {
                WordsConstantData.WordsDetail.R.wordsDetailList
            }
            "S" -> {
                WordsConstantData.WordsDetail.S.wordsDetailList
            }
            "T" -> {
                WordsConstantData.WordsDetail.T.wordsDetailList
            }
            "U" -> {
                WordsConstantData.WordsDetail.U.wordsDetailList
            }
            "V" -> {
                WordsConstantData.WordsDetail.V.wordsDetailList
            }
            "W" -> {
                WordsConstantData.WordsDetail.W.wordsDetailList
            }
            "X" -> {
                WordsConstantData.WordsDetail.X.wordsDetailList
            }
            "Y" -> {
                WordsConstantData.WordsDetail.Y.wordsDetailList
            }
            "Z" -> {
                WordsConstantData.WordsDetail.Z.wordsDetailList
            }
            else -> {
                emptyList()
            }
        }

        return wordsDetail
    }
}