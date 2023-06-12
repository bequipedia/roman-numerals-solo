public class RomanNumerals {

    public static final String V = "V";
    public static final String I = "I";

    public String convert(int inputNumber) {
        String romanNumeral = "";
        for(int i = 0; i < inputNumber; i++) {
            romanNumeral += I;
        }
        if(inputNumber >= 5) {
            romanNumeral = V;
        }
        if(inputNumber == 6) {
            romanNumeral = V + I;
        }

        return romanNumeral;
    }
}
