package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        String toReturn = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == indexToCapitalize) {
                toReturn += str.substring(i, i+1).toUpperCase();
            } else {
                toReturn += str.substring(i, i+1);
            }
        }
        return toReturn;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (baseString.charAt(indexOfString) == characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> a = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                a.add(string.substring(i, j));
            }
        }

        String[] toReturn = new String[a.size()];
        toReturn = a.toArray(toReturn);

        return toReturn;
    }

    public static Integer getNumberOfSubStrings(String input){
        int stringLength = input.length();
        return (stringLength * (stringLength + 1) / 2) - 1;
    }
}
