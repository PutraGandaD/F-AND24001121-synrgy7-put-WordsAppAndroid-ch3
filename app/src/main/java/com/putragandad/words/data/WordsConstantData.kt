package com.putragandad.words.data

object WordsConstantData {
    fun getWordsDetail(words: String?) : MutableList<String> {
        val wordsDetail = mutableListOf<String>()

        when(words) {
            "A" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Apple", "Ant", "Ask", "Away", "Above"))
            }
            "B" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Book", "Ball", "Boy", "Blue", "Bird"))
            }
            "C" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Cat", "Car", "Cup", "Cold", "Come"))
            }
            "D" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Dog", "Door", "Down", "Draw", "Dance"))
            }
            "E" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Eat", "Eye", "Ear", "Early", "End"))
            }
            "F" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Fish", "Face", "Fun", "Fast", "Fly"))
            }
            "G" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Girl", "Game", "Green", "Give", "Go"))
            }
            "H" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Hat", "Hand", "Happy", "Hot", "Help"))
            }
            "I" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Ice", "Island", "Important", "In", "It"))
            }
            "J" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Jump", "Jump", "Juice", "Join", "Joy"))
            }
            "K" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("King", "Key", "Know", "Kite", "Kick"))
            }
            "L" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Look", "Like", "Learn", "Laugh", "Love"))
            }
            "M" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Mom", "Man", "Money", "Music", "Make"))
            }
            "N" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Nose", "New", "Night", "Never", "Nice"))
            }
            "O" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Open", "Orange", "Over", "Old", "Out"))
            }
            "P" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Pen", "Play", "Put", "People", "Place"))
            }
            "Q" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Queen", "Quiet", "Quick", "Question", "Quite"))
            }
            "R" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Run", "Read", "Red", "Rain", "Right"))
            }
            "S" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("See", "Sit", "School", "Smile", "Say"))
            }
            "T" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Table", "Talk", "Take", "Tea", "Time"))
            }
            "U" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Up", "Under", "Use", "Us", "Ugly"))
            }
            "V" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Very", "Voice", "Vote", "View", "Visit"))
            }
            "W" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Walk", "Water", "Wait", "Warm", "Wind"))
            }
            "X" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Xylography", "Xylophone", "Xenogenic", "Xenolith", "Xylene"))
            }
            "Y" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Yellow", "Year", "You", "Young", "Yummy"))
            }
            "Z" -> {
                wordsDetail.clear()
                wordsDetail.addAll(listOf("Zebra", "Zoo", "Zero", "Zip", "Zone"))
            }
            else -> false
        }

        return wordsDetail
    }
}