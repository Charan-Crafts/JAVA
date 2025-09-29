
public class Remove {

    public static String removeA(String name,int length,String result){
        if(length == name.length()){
            return result;
        }
        char currentChar = name.charAt(length);
        if(currentChar != 'a' || currentChar != 'A'){
            result+=currentChar;
        }
        return removeA(name, length+1, result);
    }
    public static void main(String[] args) {
        
       String name = "Charan";
       System.out.println(removeA(name, 0, ""));
    }
}
