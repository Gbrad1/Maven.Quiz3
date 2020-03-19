package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    public static String[] wave(String str) {
        int count = 0;
        String lowerCaseString = str.toLowerCase();
        String[] buffer = new String[str.length()];
        for (int i = 0; i < buffer.length; i++) {
            if (Character.isLetter(str.charAt(i))) {
                StringBuilder sb = new StringBuilder(lowerCaseString);
                sb.setCharAt(i, Character.toUpperCase(lowerCaseString.charAt(i)));
                buffer[count] = sb.toString();
                count++;
            }
        }
        String[] toReturn = new String[count];
        for (int i = 0; i < count; i++) {
            toReturn[i] = buffer[i];
        }
        return toReturn;
    }
}
