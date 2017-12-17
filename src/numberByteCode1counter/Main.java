package numberByteCode1counter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(counter(number));
    }

    public static int counter(int number) {
        int count = 0;
        String code = Integer.toBinaryString(number);
        System.out.println("This number in binary : " + code);

        for (int i = 0; i < code.length(); i++) {
            if (Character.digit(code.charAt(i), 2) == 1)
                count ++;
        }

        return count;
    }
}

