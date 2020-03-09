package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    public static Boolean hasVowels(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar == 'A' || currentChar == 'a'
                || currentChar == 'E' || currentChar == 'e'
                || currentChar == 'I' || currentChar == 'i'
                || currentChar == 'O' || currentChar == 'o'
                    || currentChar == 'U' || currentChar == 'u') {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar == 'A' || currentChar == 'a'
                    || currentChar == 'E' || currentChar == 'e'
                    || currentChar == 'I' || currentChar == 'i'
                    || currentChar == 'O' || currentChar == 'o'
                    || currentChar == 'U' || currentChar == 'u') {
                index = i;
                break;
            } else {
                index = -1;
            }

        }
        return index;
    }

    public static Boolean startsWithVowel(String word) {
        for (int i = 0; i < 1; i++) {
            char currentChar = word.charAt(i);
                if (currentChar == 'A' || currentChar == 'a'
                    || currentChar == 'E' || currentChar == 'e'
                    || currentChar == 'I' || currentChar == 'i'
                    || currentChar == 'O' || currentChar == 'o'
                    || currentChar == 'U' || currentChar == 'u') {
                    return true;
            }
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        if (character == 'A' || character == 'a'
                || character == 'E' || character == 'e'
                || character == 'I' || character == 'i'
                || character == 'O' || character == 'o'
                || character == 'U' || character == 'u') {
            return true;
        }
        return null;
    }
}
