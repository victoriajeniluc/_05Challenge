/**
 * Write a Java program to store numbers 1 to 10 in an array using data instantiation.
 * Then write a for loop to multiply each member of above array by 19, this way you will get table of 19 stored in the above array.
 * Finally write another for loop to print all the array elements.
 * You should get following output:
 * 19
 * 38
 * 57
 * 76
 * 95
 * 114
 * 133
 * 152
 * 171
 * 190
 */

public class _2Question {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = arr[i] * 19;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
