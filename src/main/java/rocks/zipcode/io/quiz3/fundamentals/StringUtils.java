package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

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
        for (int i = 0; i < baseString.length(); i++) {
            if (baseString.charAt(i) == characterToCheckFor) {
                if (i == indexOfString) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return null;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                a.add(string.substring(i, j));
            }
        }

        String[] toReturn = new String[a.size()];
        for (int i = 0; i < a.size(); i++) {
            toReturn[i] = a.get(i);
        }
        return toReturn;
    }

    public static Integer getNumberOfSubStrings(String input){
        int stringLength = input.length();
        return (stringLength * (stringLength + 1) / 2) - 1;
    }
}
