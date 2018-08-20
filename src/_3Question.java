/**
 * Below is One-dimensional array code:
 * char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
 *
 * Write the code to search for particular character in above array.
 * If I search for 'B', then output should be: "B found!"
 * If I search for 'E', then output should be: "E Not found!"
 */
public class _3Question {
    public static void main(String[] args) {
        char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
        char searchForChar = 'p';
        boolean found = false; // variable "found" initially false, when particular char is found in array it is set to true.
        // for loop to iterate through all the array elements

        for(int i = 0; i < arr.length; i++) {
            if(searchForChar == arr[i]) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println(searchForChar + " is found here!");
        } else {
            System.out.println(searchForChar + " is not found here!");
        }

    }
}
