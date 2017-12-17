package stringRewerse2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;

        // Enter string using scanner
        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        int index = str.length()-1;
        for (int i = index; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
