import java.util.regex.*;
import java.util.*;
public class ExpressionDemo1 {
    public static void main(String[] args) {
       Pattern pat=Pattern.compile("j...");
       Scanner obj=new Scanner(System.in);
        System.out.println("enter any string:");
        String s=obj.next();
       Matcher mat=pat.matcher(s);
       if(mat.matches())
       {
            System.out.println("pattern matched");
           System.out.println("start position:"+mat.start());
           System.out.println("end position:"+mat.end());
           System.out.println("grouped characters:"+mat.group()); 
       }
       else
       {
           System.out.println("pattern does not match");
       }
    }
    
}
