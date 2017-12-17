package numberPowerOf2;

import java.util.Scanner;

import static numberByteCode1counter.Main.counter;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(powerOf2(number));
    }

    private static boolean powerOf2(int number) {
        if (counter(number) == 1)
            return true;
        
        return false;
    }
}
