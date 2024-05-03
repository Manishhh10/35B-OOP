package Week4;
public class ForLoop {
    public static void main(String[] args) {
        /* For loop takes initialization
         * condition
         * modify/update */
         for (int index = 0; index <= 5; index++) {
            // System.out.println("For Index" + index);
         }
         /* can use different update logic like
          * for (int index = 0; index<= 5 ; index += 3) */
        /* Using decrement */
        for (int index = 10; index >= 0 ; index--) {
            // System.out.println("For Index Decrement" + index);
        }

        /* Task
         * Make a multiplication table of 2
         * For eg :
         * 2 x 1 = 2
         * 2 x 2 = 4
         * ..
         * ..
         * 2 x 10 = 20
         * Note: Loop from 1 to 10 and multiply the index
         */

        for (int i = 1; i <=10; i++) {
            // System.out.println("2 x" + i + "=" + (2*i));
        }

        /* Nested for loop
         * Using for loop inside th scope of for loop */
        for (int outer = 0; outer < 2; outer++) {
            for (int inner = 0; inner > 0; inner--) {
                // System.out.println("Inner Index" + inner);
            }
            // System.out.println("Outer Index" + outer);
        }

        /* Task
         * Make a multiplication table like the following
         * Mutiplication table of 10
         * 10 x 1 = 10
         * 10 x 2 = 20
         * 10 x 3 = 30
         * ..
         * ..
         * Multiplication table of 1
         * 1 x 1 = 1
         * 1 x 2 = 2
         * ..
         * 1 x 10 = 10
         */
        
         for (int ii = 10; ii >=1; ii--) {
            System.out.println("Multiplication table of " + ii);
            for (int jj = 1; jj <= 10; jj++) {
                System.out.println(ii + "x" + jj + "=" + (ii*jj));
            }
        }
    }
}
 