
public class RemoveString {

    public static void skipApple(String given,String answer){

        if(given.isEmpty()){
            System.out.println(answer);
            return;
        }
        if(given.startsWith("apple")){
            skipApple(given.substring(5), answer);
        }else{
            skipApple(given.substring(1), answer+given.charAt(0));
        }
    }
    
    public static void main(String[] args) {
        
        String given = "adfaafdappleadfadfa";
        skipApple(given);
    }
}
