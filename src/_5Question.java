/**
 * In mathematics, the Fibonacci series are the numbers in the following integer sequence:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
 * and each subsequent number is the sum of the previous two.
 *
 * Write a Java Program to generate above series till n number of times (For example you can try with
 * n = 10 and n = 15) and store it in One-dimensional array.
 * For n = 10, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 * For n = 15, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
 *
 */
public class _5Question {
    public static void main(String[] args) {

        // create a variable to represent the number given
        int number = 15;
        // create a one-dimensional array that will hold the amount of numbers given in 'number'
        int [] arr = new int[number];

        // set the positions 0th and 1st to be 0 and 1 since they never change
        arr[0] = 0;
        arr[1] = 1;

        // create a loop that will add the first two numbers to create the third number.. so on
        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
