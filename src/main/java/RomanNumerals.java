public class RomanNumerals {

    public static final String V = "V";
    public static final String I = "I";

    public String convert(int inputNumber) {
        String romanNumeral = "";
        if(inputNumber >= 10) {
            romanNumeral = "X";
            inputNumber -= 10;
        }
        if(inputNumber >= 5) {
            romanNumeral = V;
            inputNumber -= 5;
        }
        for(int i = 0; i < inputNumber; i++) {
            romanNumeral += I;
        }

        return romanNumeral;
    }
}
