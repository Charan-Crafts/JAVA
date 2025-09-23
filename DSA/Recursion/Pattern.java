package DSA.Recursion;

public class Pattern {

    public static void pattern1(int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            
            pattern1(row, col+1);
            System.out.print("* ");
        }else{
            
            pattern1(row-1, 0);
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        pattern1(4,0);
        // pattern2(4, 0);
    }
}
