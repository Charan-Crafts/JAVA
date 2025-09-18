public class Richest {

    static int findRichestCustomer(int[][] accounts){
        int richestCustomer = Integer.MIN_VALUE;

        for(int i = 0 ;i<accounts.length;i++){
            int currSum = 0;
            for(int j = 0 ;j<accounts[i].length;j++){
                currSum += accounts[i][j];
            }
            if(currSum > richestCustomer){
                richestCustomer=currSum;
            }
        }
        return richestCustomer;
    }
    public static void main(String[] args) {
        int [][] accounts ={
            {12,24,4,1},
            {124,1,52,5},
            {12,42,51,5}
        };

        System.out.println(findRichestCustomer(accounts));

        
    }
}