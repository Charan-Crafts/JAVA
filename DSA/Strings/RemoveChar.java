package DSA.Strings;

public class RemoveChar {

    public static void removeChar(String answer,String given){

        if(given.isEmpty()){
            System.out.println(answer);
            return;
        }
        char currentChar = given.charAt(0);

        if(currentChar=='a' || currentChar=='A'){
            removeChar(answer, given.substring(1));
        }else{
            removeChar(answer+currentChar, given.substring(1));
        }
    }
    public static void main(String[] args) {
        String given  = "qweagaeaafera";
        removeChar("", given);   
    }
}
