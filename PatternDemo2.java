import java.util.regex.*;
public class PatternDemo2 {
    public static void main(String[] args) {
       Pattern pat=Pattern.compile("(6|7|8|9)[0-9]{9}");
       Matcher mat=pat.matcher("6352124578");
       if(mat.matches())
       {
           System.out.println("valid mobile number");
       }
       else
       {
           System.out.println("invalid mobile number");
       }
    }
    
}
