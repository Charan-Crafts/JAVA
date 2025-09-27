public class Main {

    public static void pattern1(int n){

        // *
        // **
        // ***
        // ****
        // *****

        for(int row = 0; row<n;row++){
            int stars = row+1;
            for(int col =0 ; col<stars;col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    
    public static void pattern2(int n){


//     *
//    ***
//   *****
//  *******
// *********

        for (int row = 0 ;row<n;row++){

            int spaces = n-row-1;
            int stars = 2*row+1;

            // for spaces 

            for(int space = 0 ;space<spaces;space++){
                System.out.print(" ");
            }

            //For stars

            for(int star = 0 ;star<stars;star++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        pattern1(5);

        pattern2(5);

    }
}
