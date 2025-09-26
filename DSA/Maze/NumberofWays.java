
public class NumberofWays {

    public static int numberofWays(int row ,int col ){

        if(row == 1 || col == 1){
            return 1;
        }

        int left = numberofWays(row-1, col);
        int right= numberofWays(row, col-1);

        return left+right;

    }
    public static void main(String[] args) {
        System.out.println(numberofWays(3,3));
    }
}
