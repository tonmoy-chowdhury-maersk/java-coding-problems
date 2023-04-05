package ch01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharacterCounterTest {

    @Test
    void testCountDuplicateChars() {
        String input = "Hello World";
        DuplicateCharacterCounter counter = new DuplicateCharacterCounter();
        int result = counter.countDuplicateCharacters(input);
        assertEquals(3, result);
    }

    @Test
    void testCountDuplicateCharsWithEmptyString() {
        String input = "";
        DuplicateCharacterCounter counter = new DuplicateCharacterCounter();
        int result = counter.countDuplicateCharacters(input);
        assertEquals(0, result);
    }

    @Test
    void testCountDuplicateCharsWithNoDuplicates() {
        String input = "abcdefg";
        DuplicateCharacterCounter counter = new DuplicateCharacterCounter();
        int result = counter.countDuplicateCharacters(input);
        assertEquals(0, result);
    }
}