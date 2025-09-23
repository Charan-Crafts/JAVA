import java.util.HashMap;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        int[] arr = {12,12,15,1,5,25,1,2,412};

        HashMap<Integer,Integer> hash = new HashMap<>();
       
    
        for(int ele : arr){
            
            if(!hash.containsKey(ele)){
                hash.put(ele,1);
            }else{
                hash.put(ele,hash.get(ele)+1);
            }
        }

        System.out.println(hash);

       
       
    }
}
