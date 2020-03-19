package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String toReturn = "";
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            int index = VowelUtils.getIndexOfFirstVowel(array[i]);
            if (index == 0) {
                toReturn += array[i] + "way";
                toReturn += addSpaceOrNot(i, array.length);
            } else if (index > 0) {
                toReturn += rotateWord(array[i], index) + "ay";
                toReturn += addSpaceOrNot(i, array.length);
            } else if (index == - 1) {
                toReturn += array[i] + "ay";
                toReturn += addSpaceOrNot(i, array.length);
            } else
                toReturn += array[i] + " ";
        }
        return toReturn;
    }

    public String rotateWord(String str, int index) {
        String toReturn = str.substring(index);
        toReturn += str.substring(0, index);
        return toReturn;
    }

    public String addSpaceOrNot(int index, int length) {
        String noSpace = "";
        String space = " ";
        if (index < length - 1) {
            return space;
        }
        return noSpace;
    }

}
