package dev.nyanchuk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DNICalculatorTest {
    @Test
    void testValidDNI() {
                assertEquals("T", DNICalculator.getDNILetter(12345678));
        assertEquals("R", DNICalculator.getDNILetter(23456789));
        assertEquals("W", DNICalculator.getDNILetter(34567890));
    }
}
