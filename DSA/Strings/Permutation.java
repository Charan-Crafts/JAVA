import java.util.ArrayList;

public class Permutation{

    public static void permuations(String up,String p){

        if(up.isEmpty()){

            System.out.println(p);
            return;
        }

        char currentChar = up.charAt(0);

        for(int i = 0;i<=p.length();i++){

            String firstString = p.substring(0, i);

            String secondString = p.substring(i,p.length());

            permuations(up.substring(1), firstString+currentChar+secondString);
        }
    }
    
    public static ArrayList<String> permutation(String up,String p){

        if(up.isEmpty()){

            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }

        char currentChar = up.charAt(0);

        ArrayList <String> res = new ArrayList<>();

        for(int i = 0 ;i<=p.length();i++){

            String firstString = p.substring(0, i);

            String secondString = p.substring(i,p.length());

            ArrayList<String> temp  = permutation(up.substring(1), firstString+currentChar+secondString);

            res.addAll(temp);
            
        }

        return res;

    }
    
    public static int numberOfPermutations(String up,String p,int count){

        if(up.isEmpty()){
            
            return ++count;
        }
        char currentChar = up.charAt(0);

        for(int i = 0;i<=p.length();i++){

            String firstString = p.substring(0, i);
            String secondString = p.substring(i,p.length());

            count=numberOfPermutations(up.substring(1), firstString+currentChar+secondString,count);
        }
        return count;
    }
    public static void main(String[] args){

        String name = "abc";

        // System.out.println(permutation(name, ""));

        System.out.println( numberOfPermutations(name, "", 0));


        System.out.println('2'-'0');
       
    }
}