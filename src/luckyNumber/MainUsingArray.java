package luckyNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class MainUsingArray {
    public static void main(String[] args) {
        int number;
        int sumFirstHalf = 0, sumSecondHalf = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        // Enter string using scanner
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        while (true) {
            arr.add(number % 10);
            if (number / 10 == 0)
                break;
            number /= 10;
        }

        int half = arr.size() / 2;  // half position in number

        for (int i = 0; i < arr.size(); i++) {
            if (arr.size() % 2 == 1) {
                if (i < half)
                    sumFirstHalf += arr.get(i);
                if (i > half)
                    sumSecondHalf += arr.get(i);
            } else {
                if (i < half)
                    sumFirstHalf += arr.get(i);
                if (i >= half)
                    sumSecondHalf += arr.get(i);
            }
        }

        System.out.println(sumFirstHalf + " , " + sumSecondHalf);

        if (sumFirstHalf == sumSecondHalf)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
