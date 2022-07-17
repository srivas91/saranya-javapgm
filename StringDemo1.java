
public class StringDemo1 {
      public static void main(String[] args) {
        String s=new String("java");
        String t=new String("JAVA");
        if(s.equalsIgnoreCase(t))
        {
            System.out.println("two strings are equal");
        }
        else
        {
            System.out.println("two strings are not equal");
        }
        
    }
    
}
