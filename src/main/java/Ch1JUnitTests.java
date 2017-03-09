import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by rPhilip on 3/2/17.
 */
public class Ch1JUnitTests {
    @Test
    public void isUnique_StrWithAllUniqueCharsReturnsTrue() {
        boolean uniqueChars = Ch1Strings.isUnique("abcd", 128);
        assertEquals(uniqueChars, true);
    }

    @Test
    public void isUnique_StrWithRepeatCharsReturnsFalse() {
        boolean uniqueChars = Ch1Strings.isUnique("aaa", 128);
        assertEquals(uniqueChars, false);
    }

    @Test
    public void isUnique_EmptyStringReturnsTrue() {
        boolean uniqueChars = Ch1Strings.isUnique("", 128);
        assertEquals(uniqueChars, true);
    }

    @Test
    public void isUniqueWithNoAdditionalDataStructureDataStructure_StrWithAllUniqueCharsReturnsTrue() {
        boolean uniqueChars = Ch1Strings.isUniqueWithNoAdditionalDataStructure("abcd");
        assertEquals(uniqueChars, true);
    }

    @Test
    public void isUniqueWithNoAdditionalDataStructureDataStructure_StrWithRepeatCharsReturnsFalse() {
        boolean uniqueChars = Ch1Strings.isUniqueWithNoAdditionalDataStructure("aaa");
        assertEquals(uniqueChars, false);
    }

    @Test
    public void isUniqueWithNoAdditionalDataStructureDataStructure_EmptyStringReturnsTrue() {
        boolean uniqueChars = Ch1Strings.isUniqueWithNoAdditionalDataStructure("");
        assertEquals(uniqueChars, true);
    }

    @Test
    public void isPermutation_ValidPermutationsReturnTrue() {
        boolean permutation = Ch1Strings.isPermutation("abc", "cba", 128);
        assertEquals(permutation, true);
    }

    @Test
    public void isPermutation_InvalidPermutationsReturnFalse() {
        boolean permutation = Ch1Strings.isPermutation("abc", "bbc", 128);
        assertEquals(permutation, false);
    }

    @Test
    public void urlify_StringWithNoSpacesHasNoChanges() {
        String str = Ch1Strings.urlify("abc");
        assertEquals(str, "abc");
    }

    @Test
    public void urlify_StringWithOneSpaceHasOnePercent20() {
        String str = Ch1Strings.urlify("ab c");
        assertEquals(str, "ab%20c");
    }

    @Test
    public void urlify_StringWithTwoSpacesHasTwoPercent20s() {
        String str = Ch1Strings.urlify("ab  c");
        assertEquals(str, "ab%20%20c");
    }

    @Test
    public void urlifyInPlace_StringWithNoSpacesHasNoChanges() {
        char[] str = Ch1Strings.urlifyInPlace(new char[]{'a', 'b', 'c'}, 3);
        assertTrue(Arrays.equals(str, new char[]{'a', 'b', 'c'}));
    }

    @Test
    public void urlifyInPlace_StringWithOneSpaceHasOnePercent20() {
        char[] str = Ch1Strings.urlifyInPlace(new char[]{'a', 'b', ' ','c', ' ', ' '}, 4);
        assertTrue(Arrays.equals(str, new char[]{'a', 'b', '%', '2', '0', 'c'}));
    }

    @Test
    public void isPalindromePermutation_PalindromeWithEvenNumLettersReturnsTrue() {
        boolean bool = Ch1Strings.isPalindromePermutation("abccba");
        assertEquals(bool, true);
    }

    @Test
    public void isPalindromePermutation_PalindromeWithOddNumLettersReturnsTrue() {
        boolean bool = Ch1Strings.isPalindromePermutation("abcba");
        assertEquals(bool, true);
    }

    @Test
    public void isPalindromePermutation_PalindromePermutationReturnsTrue() {
        boolean bool = Ch1Strings.isPalindromePermutation("abcabc");
        assertEquals(bool, true);
    }

    @Test
    public void isPalindromePermutation_NonPalindromePermutationReturnsFalse() {
        boolean bool = Ch1Strings.isPalindromePermutation("abc");
        assertEquals(bool, false);
    }

    @Test
    public void oneAway_ShouldReturnTrueIfThereAreZeroDifferences() {
        boolean bool = Ch1Strings.oneAway("abc", "abc");
        assertEquals(bool, true);
    }

    @Test
    public void oneAway_ShouldReturnTrueIfOneLetterIsChanged() {
        boolean bool = Ch1Strings.oneAway("abc", "abb");
        assertEquals(bool, true);
    }

    @Test
    public void oneAway_ShouldReturnTrueIfOneLetterIsDeleted() {
        boolean bool = Ch1Strings.oneAway("abc", "ab");
        assertEquals(bool, true);
    }

    @Test
    public void oneAway_ShouldReturnTrueIfOneLetterIsAdded() {
        boolean bool = Ch1Strings.oneAway("abc", "abcd");
        assertEquals(bool, true);
    }

    @Test
    public void oneAway_ShouldReturnFalseIfTwoLettersAdded() {
        boolean bool = Ch1Strings.oneAway("abc", "abcde");
        assertEquals(bool, false);
    }

    @Test
    public void oneAway_ShouldReturnFalseIfTwoLettersAreDifferent() {
        boolean bool = Ch1Strings.oneAway("abc", "ade");
        assertEquals(bool, false);
    }

    @Test
    public void oneAway_ShouldReturnFalseIfTwoLettersAreTakenAway() {
        boolean bool = Ch1Strings.oneAway("abc", "a");
        assertEquals(bool, false);
    }

    @Test
    public void stringCompression_strShouldBeCompressed() {
        String str = Ch1Strings.stringCompression("aabbbccccd");
        assertEquals(str, "a2b3c4d1");
    }

    @Test
    public void stringCompressions_shortStrShouldNotBeCompressed() {
        String str = Ch1Strings.stringCompression("abc");
        assertEquals(str, "abc");
    }


}
