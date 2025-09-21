
public class Main {

    public static void pattern1(int size) {

        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int size) {

        /*
         * 
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int row = 1; row <= size; row++) {
            for (int col = 1; row >= col; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int size) {

        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int row = 1; row <= size; row++) {
            for (int col = size - row; col >= 0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int size) {

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int size) {

        /*
         * 
         * 
         * *
         * * *
         * * * *
         * * *
         * *
         * 
         * 
         */

        for (int row = 1; row <= (2 * size) - 1; row++) {

            int totalCol = 3423;

            if (row <= size) {
                totalCol = row;
            } else {
                totalCol = 2 * size - row;
            }

            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int size) {

        /*
            
    * 
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

         */
        for (int row = 1; row <= 2 * size - 1; row++) {

            int totalNumberofStars = 23324;

            int totalSpace = 2343;

            if(row<=size){
                totalSpace=size-row;
            }else{
                totalSpace=row-size;
            }

            for(int col = 1;col<=totalSpace;col++){
                System.out.print(" ");
            }

            if (row <= size) {
                totalNumberofStars = row;
            } else {
                totalNumberofStars = (2 * size) - row;
            }

            for (int col = 1; col <=totalNumberofStars; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern6(5);
    }
}
