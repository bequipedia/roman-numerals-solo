public class RomanNumerals {

    public static final String I = "I";
    public static final String V = "V";

    public String convert(int inputNumber) {
        String romanNumeral = "";
        for(int i = 0; i < inputNumber; i++) {
            romanNumeral += I;
        }
        if(inputNumber == 5) {
            romanNumeral = V;
        }
        return romanNumeral;
    }
}
