import java.util.regex.*;
public class PatternDemo1 {

    public static void main(String[] args) {
       Pattern pat=Pattern.compile("saranya",Pattern.CASE_INSENSITIVE);
       Matcher mat=pat.matcher("SARANYA");
       if(mat.matches())
       {
           System.out.println("pattern Matched");
           System.out.println("start position:"+mat.start());
           System.out.println("end position:"+mat.end());
           System.out.println("grouped character:"+mat.group());
       }
       else
       {
           System.out.println("pattern does not match");
       }
    }
    
}
