import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

    @Test
    void should_return_I_when_1_given() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String expectedOutput = "I";
        int inputNumber = 1;

        String actualOutput = romanNumerals.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void should_return_II_when_2_given() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String expectedOutput = "II";
        int inputNumber = 2;

        String actualOutput = romanNumerals.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void should_return_III_when_3_given() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String expectedOutput = "III";
        int inputNumber = 3;

        String actualOutput = romanNumerals.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void should_return_V_when_5_given() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String expectedOutput = "V";
        int inputNumber = 5;

        String actualOutput = romanNumerals.convert(inputNumber);

        assertEquals(expectedOutput, actualOutput);
    }
}
