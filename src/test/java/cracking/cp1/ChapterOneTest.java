package cracking.cp1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChapterOneTest {

    @Test
    void isUniqueChars() {
        String str1 = "Hello World";
        String str2 = "abcdefgh";
        assertFalse(ChapterOne.isUniqueChars(str1));
        assertTrue(ChapterOne.isUniqueChars(str2));
    }
}