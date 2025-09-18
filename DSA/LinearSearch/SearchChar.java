
public class SearchChar {

    public static boolean searchCharAtString(String searchElement,char target){

        if(searchElement.length()==0){
            return false;
        }

        for(int i = 0 ;i<searchElement.length();i++){

            if(searchElement.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "charan";

        char target = 'a';

        System.out.println(searchCharAtString(name, target));
    }
}
