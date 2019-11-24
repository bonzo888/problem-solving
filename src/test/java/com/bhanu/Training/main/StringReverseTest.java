package com.bhanu.Training.main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {
    StringReverse stringReverse;

    @BeforeEach
    void setUp() {
        stringReverse = new StringReverse();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void reverseStringRegularString() {
        assertEquals("unahB",stringReverse.reverseString("Bhanu"));
    }

    @Test
    void reverseStringSpecialChars() {
        assertEquals("%$#@!",stringReverse.reverseString("!@#$%"));
    }

    @Test
    void reverseStringEmpty() {
        assertEquals("",stringReverse.reverseString(""));
    }

    @Test
    void reverseStringVeryLargeString() {
        assertEquals("qwertyuiopasdfghjklzxcvbnm",stringReverse.reverseString("mnbvcxzlkjhgfdsapoiuytrewq"));
    }
}