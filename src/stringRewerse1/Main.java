package stringRewerse1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        StringBuilder result = new StringBuilder();

        // Enter string using scanner
        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        int index = str.length()-1;
        for (int i = index; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        System.out.println(result);
    }
}