import java.util.ArrayList;

public class SubSequence {

    public static void subSequence(String up, String p){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char currentChar = up.charAt(0);

        subSequence(up.substring(1), p+currentChar);
        subSequence(up.substring(1),p);
    }
   
    public static ArrayList<String> subSequenceList(String up, String p){

        if(up.isEmpty()){
            //Create a list and add the 'p' into the list and return it...

            ArrayList <String> res = new ArrayList<>();
            res.add(p);

            return res;
        }

        char currentChar = up.charAt(0);

        ArrayList<String> arr1 = subSequenceList(up.substring(1), p+currentChar);
        ArrayList<String> arr2 = subSequenceList(up.substring(1), p);

        arr1.addAll(arr2);
        return arr1;
    }
    public static void main(String[] args) {
        String given = "ABC";
        System.out.println(subSequenceList(given, ""));
    }
}
