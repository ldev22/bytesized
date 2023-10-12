package com.wungatech.bytesized;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeetToMetersConverterTest {
    private FeetToMetersConverter converter;

    @BeforeEach
    void setUp() {
        converter = new FeetToMetersConverter();
    }

    @Test
    void testFeetToMetersConversion() {
        double feet = 3.0; // 3 feet is approximately 0.9144 meters
        double meters = converter.feetToMeters(feet);
        assertEquals(0.9144, meters, 0.001); // A small delta for rounding errors
    }
}
