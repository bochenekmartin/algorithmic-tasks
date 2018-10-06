package com.algorithmic.problems;

/**
 * User: Martin Bochenek (SG0212051)
 * Date: Nov 3, 2010
 */
public class Problem017 {

    public final static String AND = "and";

    public final static String ONE = "one";
    public final static String TWO = "two";
    public final static String THREE = "three";
    public final static String FOUR = "four";
    public final static String FIVE = "five";
    public final static String SIX = "six";
    public final static String SEVEN = "seven";
    public final static String EIGHT = "eight";
    public final static String NINE = "nine";
    public final static String[] ONE_TO_NINE = {"", ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE};

    public final static String ELEVEN = "eleven";
    public final static String TWELVE = "twelve";
    public final static String THIRTEEN = "thirteen";
    public final static String FOURTEEN = "fourteen";
    public final static String FIFTEEN = "fifteen";
    public final static String SIXTEEN = "sixteen";
    public final static String SEVENTEEN = "seventeen";
    public final static String EIGHTEEN = "eighteen";
    public final static String NINETEEN = "nineteen";

    public final static String[] ELEVEN_TO_NINETEEN = {ELEVEN, TWELVE, THIRTEEN, FOURTEEN, FIFTEEN, SIXTEEN, SEVENTEEN, EIGHTEEN, NINETEEN};

    public final static String TEN = "ten";
    public final static String TWENTY = "twenty";
    public final static String THIRTY = "thirty";
    public final static String FORTY = "forty";
    public final static String FIFTY = "fifty";
    public final static String SIXTY = "sixty";
    public final static String SEVENTY = "seventy";
    public final static String EIGHTY = "eighty";
    public final static String NINETY = "ninety";
    public final static String[] TENS = {"", TEN, TWENTY, THIRTY, FORTY, FIFTY, SIXTY, SEVENTY, EIGHTY, NINETY};

    public final static String HUNDRED = "hundred";
    public final static String THOUSAND = "thousand";

    public static void main(String[] args) {
        new Problem017().solve(999);
    }

    private void solve(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            String numberName = getNumberName(Integer.toString(i));
            result += numberName.length();
        }
        result += ONE.length() + THOUSAND.length();
        System.out.println("result " + result);
    }

    private String getNumberName(String number) {
        String numberName = "";
        if (number.length() == 1) {
            int one = Integer.parseInt(String.valueOf(number.charAt(0)));
            numberName += ONE_TO_NINE[one];
        }
        if (number.length() == 2) {
            int ten = Integer.parseInt(String.valueOf(number.charAt(0)));
            int one = Integer.parseInt(String.valueOf(number.charAt(1)));
            numberName += getTwoDigitNumberName(ten, one);
        }
        if (number.length() == 3) {
            numberName = "";

            int hundred = Integer.parseInt(String.valueOf(number.charAt(0)));

            numberName += ONE_TO_NINE[hundred] + HUNDRED;

            int ten = Integer.parseInt(String.valueOf(number.charAt(1)));
            int one = Integer.parseInt(String.valueOf(number.charAt(2)));
            if (ten != 0 || one != 0) {
                numberName += AND;
            }
            numberName += getTwoDigitNumberName(ten, one);
        }
        return numberName;
    }

    private String getTwoDigitNumberName(int ten, int one) {
        String result = "";
        if (ten == 1 && one != 0) {
            result += ELEVEN_TO_NINETEEN[one - 1];
        } else {
            result += TENS[ten] + ONE_TO_NINE[one];
        }
        return result;
    }
}
