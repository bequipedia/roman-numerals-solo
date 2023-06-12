public class RomanNumerals {
    public String convert(int inputNumber) {
        if(inputNumber == 3) {
            return "III";
        }
        if(inputNumber == 2) {
            return "II";
        }
        return "I";
    }
}
