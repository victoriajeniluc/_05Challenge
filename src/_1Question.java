/**
 * Write a Java Program to store numbers from 1 to 1000 in One-dimensional array and then print array contents as follows (10 elements per row):
 * 1    2    3    4    5    6    7    8    9    10
 * 11    12    13    14    15    16    17    18    19    20
 * 21    22    23    24    25    26    27    28    29    30
 * .
 * .
 * .
 * 991    992    993    994    995    996    997    998    999    1000
 *
 *  @author Udayan Khattry
 */
public class _1Question {
    public static void main(String[] args) {
        int [] arrayNumbers = new int[1000];

        //for loop to assign numbers from 1 to 1000 to all the array elements
        //NOTE: No Step expression here, i is incremented inside loop body.
        for(int i = 0; i < arrayNumbers.length; arrayNumbers[i] = ++i){
        }

        //for loop to print all the array elements, 10 per row.
        for(int j = 0; j <  arrayNumbers.length; ) {
            System.out.print(arrayNumbers[j] + "\t");
            //Check to have newline added after printing 10 array elements
            //NOTE: No Step expression here, i is incremented inside loop body.
            if(++j % 10 == 0) {
                System.out.println();
            }
        }

    }
}
