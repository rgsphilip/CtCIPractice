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


}
