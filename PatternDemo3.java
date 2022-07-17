import java.util.regex.*;
public class PatternDemo3 {
    public static void main(String[] args) {
       Pattern pat=Pattern.compile("[a-z]{6}[0-9]{4}@(gmail|yahoo)(.com)");
       Matcher mat=pat.matcher("ssaran9890gmail.com");
       if(mat.matches())
       {
           System.out.println("valid email id");
       }
       else
       {
           System.out.println("invalid email id");
       }
    }
    
}
