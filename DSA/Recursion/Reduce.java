
public class Reduce {

    public static int reduce(int number,int count){

        if(number<=0){
            return count;
        }
        if (number % 2== 0){
            return reduce(number/2, ++count);
        }else{
            return reduce(number-1, ++count);
        }
    }
    public static void main(String[] args) {
        System.out.println(reduce(14, 0));
    }
}
