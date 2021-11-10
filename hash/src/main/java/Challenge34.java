import java.util.HashSet;

public class Challenge34 {
    static boolean uniquecharacters(String str)
    {HashSet<Character> charSet = new HashSet<>();
        for(int i = 0; i< str.length();i++) {
            charSet.add(str.charAt(i));
        }if(charSet.size() == str.length()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args)
    {
        String str = "I love cats ";
        String string = str.replace(" ", "").toLowerCase();
        if (uniquecharacters(string)) {
            System.out.print("true");
        }else{
            System.out.print("False");
        }
    }
}