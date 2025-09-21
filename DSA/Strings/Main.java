
public class Main {
    public static void main(String[] args) {
        
        String name = "Charan";

        String name2  = "Charan";

        int length = name2.length();

        String result= "";

        for(int i = length-1;i<=0;i--){
            result=result+name.charAt(i);
        }
        System.out.println(result);

    }
}
