/**
 * Created by rPhilip on 3/2/17.
 */
public class Ch1Strings {
    static boolean isUnique(String str, int numCharactersInCharset) {
        //O(n) time complexity
        //O(c) space complexity where c is a constant (number of characters in the character set)
        int len = str.length();
        if (len > numCharactersInCharset) {
            return false;
        }

        boolean[] boolArray= new boolean[numCharactersInCharset];

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

    static boolean isUniqueWithNoAdditionalDataStructure(String str) {
        //must be done without an additional data structure
        //O(n^2) time complexity
        //no additional space complexity
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

    static boolean isPermutation(String str1, String str2, int numCharactersInCharset) {
        //time complexity: O(n)
        //space complexity: O(c) where c is the constant of how big the charset is

        //this check is critical to the algorithm working.
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] letters = new int[numCharactersInCharset];
        int len = str1.length();
        for (int i = 0; i < len; i++) {
            int val = str1.charAt(i);
            letters[val]++;
        }

        for (int i = 0; i < len; i++) {
            int val = str2.charAt(i);
            letters[val]--;
            if (letters[val] < 0) {
                return false;
            }
        }


        return true;
    }


    public static String urlify(String str) {
        return "";
    }
}
