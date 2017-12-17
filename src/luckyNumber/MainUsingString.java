package luckyNumber;

import java.util.Scanner;

public class MainUsingString {
    public static void main(String[] args) {
        int number;
        int sumFirstHalf = 0, sumSecondHalf = 0;

        // Enter string using scanner
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        String strNum = String.valueOf(number); // change given number to string

        int half = strNum.length() / 2;  // half position in number

        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.length() % 2 == 1) {
                if (i < half)
                    sumFirstHalf += Character.digit(strNum.charAt(i), 10);
                if (i > half)
                    sumSecondHalf += Character.digit(strNum.charAt(i), 10);
            } else {
                if (i < half)
                    sumFirstHalf += Character.digit(strNum.charAt(i), 10);
                if (i >= half)
                    sumSecondHalf += Character.digit(strNum.charAt(i), 10);
            }
        }

        System.out.println(sumFirstHalf + " , " + sumSecondHalf);

        if (sumFirstHalf == sumSecondHalf)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
