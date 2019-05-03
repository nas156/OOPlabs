package Lab5;

import Lab5.Letter;

import java.util.Arrays;

public class Word {
    private Letter[] letters;

    public Word(String wordString) {
        char[] chars = wordString.toCharArray();
        letters = new Letter[chars.length];
        for (int i = 0; i < chars.length; i++) {
            letters[i] = new Letter(chars[i]);
        }
    }

    static boolean isNotNeededLetter(String word){
        return (Arrays.binarySearch(Letter.neededLetters, (word.toLowerCase()).charAt(0)) < 0);

    }
    @Override
    public String toString() {
        String result = "";
        for (Letter letter : letters) {
            result += letter.toString();
        }
        return result;
    }
}
