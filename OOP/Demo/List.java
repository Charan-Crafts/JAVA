import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class List {
    public static void main(String[] args) {
        
       ArrayList <String> studentNames = new ArrayList<>();

       HashMap <String,String> studentDetails = new HashMap<>();

       studentDetails.put("Charan", "2330");
       studentDetails.put("Kalyan", "234");

      for(Map.Entry<String,String>details : studentDetails.entrySet()){

        System.out.println(details.getKey()+"===>"+details.getValue());
      }
      
    }
}
