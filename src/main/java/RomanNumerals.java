public class RomanNumerals {

    public static final String I = "I";

    public String convert(int inputNumber) {
        String romanNumeral = "";
        for(int i = 0; i < inputNumber; i++) {
            romanNumeral += I;
        }
        return romanNumeral;
    }
}
