public class RomanNumerals {

    private enum Numeral {
        TEN(10, "X"),
        NINE(9, "IX"),
        FIVE(5, "V"),
        FOUR(4, "IV"),
        ONE(1, "I");

        private final int number;
        private final String romanNumber;

        Numeral(int number, String romanNumber) {

            this.number = number;
            this.romanNumber = romanNumber;
        }
    }

    public String convert(int inputNumber) {
        String romanNumeral = "";

        for (Numeral numberKey : Numeral.values()) {
            while (inputNumber >= numberKey.number) {
                romanNumeral += numberKey.romanNumber;
                inputNumber -= numberKey.number;
            }
        }
//
//        while(inputNumber >= Numeral.TEN.number) {
//            romanNumeral += Numeral.TEN.romanNumber;
//            inputNumber -= Numeral.TEN.number;
//        }
//        while(inputNumber >= Numeral.NINE.number) {
//            romanNumeral += Numeral.NINE.romanNumber;
//            inputNumber -= Numeral.NINE.number;
//        }
//
//        while(inputNumber >= Numeral.FIVE.number) {
//            romanNumeral += Numeral.FIVE.romanNumber;
//            inputNumber -= Numeral.FIVE.number;
//        }
//        while(inputNumber >= Numeral.FOUR.number) {
//            romanNumeral += Numeral.FOUR.romanNumber;
//            inputNumber -= Numeral.FOUR.number;
//        }
//        if(inputNumber <= 3) {
//            romanNumeral += Numeral.ONE.romanNumber.repeat(inputNumber);
//        }

        return romanNumeral;
    }
}
