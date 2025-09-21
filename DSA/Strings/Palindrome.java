
public class Palindrome {

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        if(str==null){
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {

            char first = str.charAt(i);
            char last = str.charAt(str.length() - 1 - i);

            if (first != last) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "CharanaahC";
        System.out.println(isPalindrome(name));
    }
}
