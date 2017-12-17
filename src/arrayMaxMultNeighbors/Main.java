package arrayMaxMultNeighbors;

public class Main {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 234, -23, 45, 54, 7, -9, 18, 99, 37};
        int arr[] = {1, 2, 3, 4, 5, 6, 5, 4, 3, 10, 1};
        int max = arr[0] * arr[1];

        int index = arr.length - 2;

        for (int i = 0; i < index; i++) {  // find max
            if (arr[i] * arr[i+1] > max)   // array element multiply with element after
                max = arr[i] * arr[i+1];
        }

        System.out.println("MaxMult = " + max);

        for (int i = 0; i < index; i++) {
            if (arr[i] * arr[i+1] == max)
                System.out.println("Elements : arr[" + i + "] = " + arr[i] + " , arr[" + (i+1) + "] = " + arr[i+1]);
        }
    }
}
