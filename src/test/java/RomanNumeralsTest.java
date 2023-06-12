import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    @Test
    void should_return_1_when_I_given() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String expectedOutput = "I";
        int inputNumber = 1;

        String actualOutput = romanNumerals.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void should_return_2_when_II_given() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String expectedOutput = "II";
        int inputNumber = 2;

        String actualOutput = romanNumerals.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
}
