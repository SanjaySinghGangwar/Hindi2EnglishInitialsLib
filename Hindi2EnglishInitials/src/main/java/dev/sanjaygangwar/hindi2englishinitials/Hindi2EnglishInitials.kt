package dev.sanjaygangwar.hindi2englishinitials

object Hindi2EnglishInitials {
    fun convertHindiToEnglish(input: String,separator:String): String {
        val hindiToEnglishMap = mapOf(
            "अ" to "a",
            "आ" to "aa",
            "इ" to "i",
            "ई" to "ee",
            "उ" to "u",
            "ऊ" to "oo",
            "ऋ" to "ri",
            "ए" to "e",
            "ऐ" to "ai",
            "ओ" to "o",
            "औ" to "au",
            "क" to "k",
            "ख" to "kh",
            "ग" to "g",
            "घ" to "gh",
            "च" to "ch",
            "छ" to "chh",
            "ज" to "j",
            "झ" to "jh",
            "ट" to "t",
            "ठ" to "th",
            "ड" to "d",
            "ढ" to "dh",
            "त" to "t",
            "थ" to "th",
            "द" to "d",
            "ध" to "dh",
            "न" to "n",
            "प" to "p",
            "फ" to "ph",
            "ब" to "b",
            "भ" to "bh",
            "म" to "m",
            "य" to "y",
            "र" to "r",
            "ल" to "l",
            "व" to "v",
            "श" to "sh",
            "ष" to "s",
            "स" to "s",
            "ह" to "h",
            "क्ष" to "ksh",
            "त्र" to "tr",
            "ज्ञ" to "gya",
            "ं" to "ng",
            "ः" to ":",
            "।" to "|",
            "॥" to "||"
        )

        val convertedString = input.map { hindiChar ->
            val englishEquivalent = hindiToEnglishMap[hindiChar.toString()]
            englishEquivalent ?: hindiChar.toString()
        }.joinToString(separator)

        return convertedString
    }
    fun getFirstLettersOfNames(fullName: String,separator:String): String {
        val names = fullName.split(" ") // Split the full name into individual names
        val firstLetters = names.map { it.first() } // Map each name to its first letter
        return firstLetters.joinToString(separator) // Join the first letters into a single string
    }
}