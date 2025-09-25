import java.util.ArrayList;

public class AsciiValue {

    public static void ascii(String up, String p) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int asciivalue = up.charAt(0);

        char currentChar = up.charAt(0);

        ascii(up.substring(1), p + currentChar);
        ascii(up.substring(1), p + asciivalue);
        ascii(up.substring(1), p);

    }

    public static ArrayList<String> asciiString(String up, String p) {
        if (up.isEmpty()) {
            ArrayList<String> re = new ArrayList<>();
            re.add(p);
            return re;
        }

        char currentChar = up.charAt(0);
        int currentAscii = up.charAt(0);

        ArrayList<String> left = asciiString(up.substring(1), p + currentChar);
        ArrayList<String> middle = asciiString(up.substring(1), p + currentAscii);
        ArrayList<String> right = asciiString(up.substring(1), p);

        left.addAll(right);
        left.addAll(middle);

        return left;

    }

    public static void main(String[] args) {

        String g = "abc";
        System.out.println(asciiString(g, ""));
    }
}
