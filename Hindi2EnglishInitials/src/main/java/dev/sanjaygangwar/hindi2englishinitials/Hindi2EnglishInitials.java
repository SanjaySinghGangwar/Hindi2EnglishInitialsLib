package dev.sanjaygangwar.hindi2englishinitials;

import java.util.HashMap;
import java.util.Map;

public class Hindi2EnglishInitials {
    public static String convertHindiToEnglish(String input, String separator) {
        Map<String, String> hindiToEnglishMap = new HashMap<>();
        hindiToEnglishMap.put("अ", "a");
        hindiToEnglishMap.put("आ", "aa");
        hindiToEnglishMap.put("इ", "i");
        hindiToEnglishMap.put("ई", "ee");
        hindiToEnglishMap.put("उ", "u");
        hindiToEnglishMap.put("ऊ", "oo");
        hindiToEnglishMap.put("ऋ", "ri");
        hindiToEnglishMap.put("ए", "e");
        hindiToEnglishMap.put("ऐ", "ai");
        hindiToEnglishMap.put("ओ", "o");
        hindiToEnglishMap.put("औ", "au");
        hindiToEnglishMap.put("क", "k");
        hindiToEnglishMap.put("ख", "kh");
        hindiToEnglishMap.put("ग", "g");
        hindiToEnglishMap.put("घ", "gh");
        hindiToEnglishMap.put("च", "ch");
        hindiToEnglishMap.put("छ", "chh");
        hindiToEnglishMap.put("ज", "j");
        hindiToEnglishMap.put("झ", "jh");
        hindiToEnglishMap.put("ट", "t");
        hindiToEnglishMap.put("ठ", "th");
        hindiToEnglishMap.put("ड", "d");
        hindiToEnglishMap.put("ढ", "dh");
        hindiToEnglishMap.put("त", "t");
        hindiToEnglishMap.put("थ", "th");
        hindiToEnglishMap.put("द", "d");
        hindiToEnglishMap.put("ध", "dh");
        hindiToEnglishMap.put("न", "n");
        hindiToEnglishMap.put("प", "p");
        hindiToEnglishMap.put("फ", "ph");
        hindiToEnglishMap.put("ब", "b");
        hindiToEnglishMap.put("भ", "bh");
        hindiToEnglishMap.put("म", "m");
        hindiToEnglishMap.put("य", "y");
        hindiToEnglishMap.put("र", "r");
        hindiToEnglishMap.put("ल", "l");
        hindiToEnglishMap.put("व", "v");
        hindiToEnglishMap.put("श", "sh");
        hindiToEnglishMap.put("ष", "s");
        hindiToEnglishMap.put("स", "s");
        hindiToEnglishMap.put("ह", "h");
        hindiToEnglishMap.put("क्ष", "ksh");
        hindiToEnglishMap.put("त्र", "tr");
        hindiToEnglishMap.put("ज्ञ", "gya");
        hindiToEnglishMap.put("ं", "ng");
        hindiToEnglishMap.put("ः", ":");
        hindiToEnglishMap.put("।", "|");
        hindiToEnglishMap.put("॥", "||");

        StringBuilder convertedString = new StringBuilder();
        for (char hindiChar : input.toCharArray()) {
            String englishEquivalent = hindiToEnglishMap.get(String.valueOf(hindiChar));
            if (englishEquivalent != null) {
                convertedString.append(englishEquivalent);
            } else {
                convertedString.append(hindiChar);
            }
            convertedString.append(separator);
        }

        return convertedString.toString();
    }

    public static String getFirstLettersOfNames(String fullName, String separator) {
        String[] names = fullName.split(" ");
        StringBuilder firstLetters = new StringBuilder();
        for (String name : names) {
            if (!name.isEmpty()) {
                firstLetters.append(name.charAt(0));
                firstLetters.append(separator);
            }
        }
        return firstLetters.toString();
    }
}
