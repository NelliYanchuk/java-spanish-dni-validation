package dev.nyanchuk;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DNICalculatorTest {

    @Test
    void testValidDNI() {
        assertEquals("Z", DNICalculator.validateDNI("12345678"));
        assertEquals("D", DNICalculator.validateDNI("23456789"));
        assertEquals("V", DNICalculator.validateDNI("34567890"));

        // Test boundaries
        assertEquals("T", DNICalculator.validateDNI("00000000"));
        assertEquals("R", DNICalculator.validateDNI("99999999"));
    }

    @Test
    void testInvalidDNI() {
        // Test invalid DNIs (less than 8 digits, more than 8 digits, non-numeric)
        assertInvalidDNI("12345", "The entered number is out of range. Please enter a valid 8-digit number.");
        assertInvalidDNI("123456789", "The entered number is out of range. Please enter a valid 8-digit number.");
        assertInvalidDNI("abc12345", "The entered data is incorrect. Please enter a valid number.");
    }

    // Helper method to assert exception for invalid input and check error message
    private void assertInvalidDNI(String dni, String expectedMessage) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            DNICalculator.validateDNI(dni);
        });
        assertTrue(exception.getMessage().contains(expectedMessage));
    }
}
