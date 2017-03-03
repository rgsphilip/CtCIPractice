/**
 * Created by rPhilip on 3/2/17.
 */
public class Ch1Strings {
    public static boolean isUnique(String str, int numCharacterInCharset) {
        int len = str.length();
        if (len > numCharacterInCharset) {
            return false;
        }

        boolean[] boolArray= new boolean[numCharacterInCharset];

        for(int i = 0; i < len; i++) {
            int val = str.charAt(i);
            if (boolArray[val]) {
                return false;
            } else {
                boolArray[val] = true;
            }
        }

        return true;
    }

    public static boolean isUniqueWithNoAdditionalDataStructure(String str) {
        //must be done without an additional data structure
        int len = str.length();
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPermutation(String str1, String str2) {
        return false;
    }

    public static String urlify(String str) {
        return "";
    }
}
