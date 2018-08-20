/**
 * Question 4:
 * short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
 * Above array stores the scores of a batsman in his last 10 innings in the game of cricket.
 * To know more about cricket, you can visit Wikipedia link: https://en.wikipedia.org/wiki/Cricket
 * If score is greater than or equal to 50 but less than 100, it is regarded as half-century.
 * If score is greater than or equal to 100 but less than 200, it is regarded as a century.
 * If score is greater than or equal to 200, it is regarded as a double-century.
 *
 *
 * NOTE: No scenario of triple-century in this case.
 *
 * Write the code to print the number of half-centuries, centuries and double-centuries scored by the batsman.
 *
 * OUTPUT:
 *
 * half-century
 * half-century
 * half-century
 * century
 * half-century
 * century
 * half-century
 * double-century
 */
public class _4Question {
    public static void main(String[] args) {
        short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
        String [] statements = new String [10];

        for(int i = 0; i < scores.length; i++) {
            if(scores[i] >= 50 && scores[i] < 100) {
                statements[i] = "half-century";
                //System.out.println("half-century");
            } else if(scores[i] >= 100 && scores[i] < 200) {
                //System.out.println("century");
                statements[i] = "century";
            } else if(scores[i] >= 200) {
                statements[i] = "double-century";
                //System.out.println("double-century");
            }
        }

        for(int i = 0; i < scores.length; i++) {
            if(statements[i] == null) {
                System.out.println("score was too low!");
            } else {
                System.out.println(statements[i]);
            }
        }
    }
}
