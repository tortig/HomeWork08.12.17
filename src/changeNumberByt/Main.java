package changeNumberByt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int index = in.nextInt();  // index of byte for change to 0

        change(number, index);
    }

    private static void change(int number, int index) {
        String code = Integer.toBinaryString(number);
        System.out.println("This number code is : " + code);

        System.out.println("Code after change is: " + code.substring(0,index) + '0'
                                                    + code.substring(index+1,code.length()));
    }
}
