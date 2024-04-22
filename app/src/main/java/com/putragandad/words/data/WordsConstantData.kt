package com.putragandad.words.data

object WordsConstantData {
    // Alphabet array
    val alphabetArray = ('A'..'Z').map { it.toString() }.toList()

    enum class WordsDetail(val wordsDetailList: List<String>) {
        A(listOf("Apple", "Ant", "Ask", "Away", "Above")),
        B(listOf("Book", "Ball", "Boy", "Blue", "Bird")),
        C(listOf("Cat", "Car", "Cup", "Cold", "Come")),
        D(listOf("Dog", "Door", "Down", "Draw", "Dance")),
        E(listOf("Eat", "Eye", "Ear", "Early", "End")),
        F(listOf("Fish", "Face", "Fun", "Fast", "Fly")),
        G(listOf("Girl", "Game", "Green", "Give", "Go")),
        H(listOf("Hat", "Hand", "Happy", "Hot", "Help")),
        I(listOf("Ice", "Island", "Important", "In", "It")),
        J(listOf("Jump", "Jump", "Juice", "Join", "Joy")),
        K(listOf("King", "Key", "Know", "Kite", "Kick")),
        L(listOf("Look", "Like", "Learn", "Laugh", "Love")),
        M(listOf("Mom", "Man", "Money", "Music", "Make")),
        N(listOf("Nose", "New", "Night", "Never", "Nice")),
        O(listOf("Open", "Orange", "Over", "Old", "Out")),
        P(listOf("Pen", "Play", "Put", "People", "Place")),
        Q(listOf("Queen", "Quiet", "Quick", "Question", "Quite")),
        R(listOf("Run", "Read", "Red", "Rain", "Right")),
        S(listOf("See", "Sit", "School", "Smile", "Say")),
        T(listOf("Table", "Talk", "Take", "Tea", "Time")),
        U(listOf("Up", "Under", "Use", "Us", "Ugly")),
        V(listOf("Very", "Voice", "Vote", "View", "Visit")),
        W(listOf("Walk", "Water", "Wait", "Warm", "Wind")),
        X(listOf("Xylography", "Xylophone", "Xenogenic", "Xenolith", "Xylene")),
        Y(listOf("Yellow", "Year", "You", "Young", "Yummy")),
        Z(listOf("Zebra", "Zoo", "Zero", "Zip", "Zone")),
    }
}