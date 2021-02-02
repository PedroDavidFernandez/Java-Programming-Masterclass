package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeenNumberCheckerTest {
    @Test
    public void testNumberIsTeen() {
        assertEquals(false, TeenNumberChecker.hasTeen(1, 6, 7));
        assertEquals(true, TeenNumberChecker.hasTeen(9, 99, 19));
        assertEquals(true, TeenNumberChecker.hasTeen(23, 15, 52));
        assertEquals(false, TeenNumberChecker.hasTeen(22, 23, 24));
    }
}
