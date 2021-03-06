import java.util.HashMap;

/**
 * Created by rPhilip on 3/2/17.
 */
class Ch1Strings {
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


    static String urlify(String str) {
        //time complexity: O(n)
        //space complexity: O(n)
        String returnStr = "";
        int len = str.length();
        for(int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
                returnStr += str.charAt(i);
            } else {
                returnStr += "%20";
            }
        }

        return returnStr;
    }

    static char[] urlifyInPlace(char[] str, int strlen) {
        //time complexity: O(n)
        //space complexity: O(1)
        //assumes that str is big enough to hold the '%20's required
        int ptrToEndOfCharArray = str.length - 1;
        for(int i = strlen -1; i > -1; i--) {
            if (str[i] != ' ') {
                str[ptrToEndOfCharArray] = str[i];
                ptrToEndOfCharArray--;
            } else {
                str[ptrToEndOfCharArray] = '0';
                str[ptrToEndOfCharArray - 1] = '2';
                str[ptrToEndOfCharArray - 2] = '%';
                ptrToEndOfCharArray -= 3;
            }
        }
        return str;
    }

    static boolean isPalindromePermutation(String str) {
        //time complexity: O(n + m) where n is the length of str and m is the number
        //of unique letters in str. Reduces to O(n).
        //space complexity: O(m)

        //per specification, should ignore spaces
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                int newVal = map.get(str.charAt(i)) + 1;
                map.put(str.charAt(i), newVal);
            }
        }
        int numOddInstancesOfChar = 0;
        for(Integer value : map.values()) {
            if (value % 2 == 1) {
                if (numOddInstancesOfChar > 0) {
                    return false;
                }
                numOddInstancesOfChar++;
            }
        }

        return true;
    }

    static boolean oneAway(String str1, String str2) {
        //time complexity is equal to the functions called (O(n))
        //space complexity is equal to the functions called (O(1))
        if (str1.length() == str2.length()) {
            return oneDifferent(str1, str2);
        } else if (str1.length() + 1 == str2.length()) {
            return oneRemoved(str2, str1);
        } else if (str1.length() == str2.length() + 1) {
            return oneRemoved(str1, str2);
        }
        return false;
    }

    static boolean oneRemoved(String longStr, String shortStr) {
        //time complexity: O(n) (iterating through the string). Can be
        //shorter in the case of more than one difference in the string before the end
        //space complexity: O(1) (offset)
        if (longStr.length() != shortStr.length() + 1) {
            return false;
        }
        int offset = 0;
        for (int i = 0; i < shortStr.length(); i++) {
            if (longStr.charAt(offset + i) != shortStr.charAt(i)) {
                if (offset > 0) {
                    return false;
                }
                offset++;
            }
        }
        return true;
    }

    static boolean oneDifferent(String str1, String str2) {
        //time complexity: O(n) (iterating through the string). Can be
        //shorter in the case of more than one difference in the string before the end
        //space complexity: O(1) (differences)
        if (str1.length() != str2.length()) {
            return false;
        }
        int differences = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (differences > 0) {
                    return false;
                }
                differences++;
            }
        }
        return true;
    }

    static String stringCompression(String str) {
        String returnStr = "";
        int len = str.length();
        char currentChar = str.charAt(0);
        int currentCount = 1;
        for (int i = 1; i < len; i++) {
            if (str.charAt(i) == currentChar) {
                currentCount++;
            } else {
                returnStr+= currentChar;
                returnStr += Integer.toString(currentCount);
                currentCount = 1;
                currentChar = str.charAt(i);
            }
        }
        returnStr+= currentChar;
        returnStr += Integer.toString(currentCount);

        if (str.length() <= returnStr.length()) {
            return str;
        } else {
            return returnStr;
        }
    }
}
