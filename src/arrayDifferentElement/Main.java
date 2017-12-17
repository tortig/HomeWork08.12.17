package arrayDifferentElement;

public class Main {
    public static void main(String[] args) {
        int array[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        int different = 0;

        if (array.length < 3) {   // if array.length < 3
            System.out.println("Need more elements");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = 0; i < array.length-1; i++) {  // if array.length >= 3
                if (array[i] != array[i+1]) {
                    if (i == array.length-2) {   // the last two elements of array
                        if (array[i] == array[i-1])   // compare with element before
                            different = i+1;
                        else
                            different = i;
                    } else {
                        if (array[i] == array[i+2])  // compare with element after
                            different = i+1;
                        else
                            different = i;
                    }
                }

            }
        }

        System.out.println("The different is : array[" + different + "] = " + array[different]);
    }
}
