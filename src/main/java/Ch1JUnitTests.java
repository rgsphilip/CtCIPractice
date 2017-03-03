import org.junit.Test;

import static org.junit.Assert.assertEquals;

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


}
