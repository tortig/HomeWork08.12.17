package polindromeString;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String str;
        boolean flag = true;

        // Enter string using scanner
        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        int index = str.length()-1;
        for (int i = 0; i < index; i++) {
            if (str.charAt(i) != str.charAt(index-i)) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}
