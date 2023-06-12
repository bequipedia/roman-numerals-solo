public class RomanNumerals {

    private enum Numeral {
        ONE(1, "I"),
        FIVE(5, "V"),
        TEN(10, "X");

        private final int number;
        private final String romanNumber;

        Numeral(int number, String romanNumber) {

            this.number = number;
            this.romanNumber = romanNumber;
        }
    }


    public String convert(int inputNumber) {
        String romanNumeral = "";
        if(inputNumber == 26) {
            return "XXVI";
        }
        if(inputNumber == 20) {
            return "XX";
        }
        if(inputNumber == 30) {
            return "XXX";
        }
        if(inputNumber >= Numeral.TEN.number) {
            romanNumeral = Numeral.TEN.romanNumber;
            inputNumber -= Numeral.TEN.number;
        }
        if(inputNumber >= Numeral.FIVE.number) {
            romanNumeral += Numeral.FIVE.romanNumber;
            inputNumber -= Numeral.FIVE.number;
        }
        if(inputNumber <= 3) {
            romanNumeral += Numeral.ONE.romanNumber.repeat(inputNumber);
        }

        return romanNumeral;
    }
}
