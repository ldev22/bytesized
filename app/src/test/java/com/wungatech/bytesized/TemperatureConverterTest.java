package com.wungatech.bytesized;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {
    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    void testFahrenheitToCelsius() {
        double fahrenheit = 32.0;  // 32°F is 0°C
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        assertEquals(0.0, celsius, 0.01);  // A small delta for rounding errors
    }
}
