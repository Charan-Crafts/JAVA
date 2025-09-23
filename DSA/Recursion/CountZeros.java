
public class CountZeros {
    
    

    public static int countNumberOfZeros(int number,int count){

        int remainder = number %10;
        int quotient = number / 10;

        if(quotient==0){
            return count;
        }
        
        return countNumberOfZeros(quotient,remainder==0?++count:count);
    }
    public static void main(String[] args) {
        System.out.println(countNumberOfZeros(0434300,0));
    }
}
