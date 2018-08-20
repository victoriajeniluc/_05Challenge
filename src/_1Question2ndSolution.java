/**
 * Question 1:
 * Write a Java Program to store numbers from 1 to 1000 in One-dimensional array and then print array contents as follows (10 elements per row):
 * 1	2	3	4	5	6	7	8	9	10
 * 11	12	13	14	15	16	17	18	19	20
 * 21	22	23	24	25	26	27	28	29	30
 * .
 * .
 * .
 * 991	992	993	994	995	996	997	998	999	1000
 *
 * For assigning values to array elements, we are using an int variable "val".
 * For printing array elements, 10 per row, we are using another int variable "counter".
 *
 * @author Udayan Khattry
 */

public class _1Question2ndSolution {
    public static void main(String[] args) {
        //One-Dimensional int array to store 1000 numbers from 1 to 1000
        int [] arr = new int [1000];
        int val = 1; //val has the number to be stored in array, in each iteration it is incremented by 1.
        //for loop to assign numbers from 1 to 1000 to all the array elements
        for(int i = 0; i < 1000; i++) {
            arr[i] = val++;
        }

        int counter = 1; //counter variable helps to add newline after printing 10 numbers.
        //for loop to print all the array elements, 10 per row.
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            //Check to have newline added after printing 10 array elements
            if(counter++ % 10 == 0) {
                System.out.println();
            }
        }
    }
}
