public class StringDemo4 {
    public static void main(String[] args) {
     String name="SaRaNya";
     char s[]=name.toCharArray();
     int lcount=0,ucount=0;
     for(char c:s)
     {
         if(Character.isLowerCase(c))
         {
             lcount=lcount+1;
         }
         else if(Character.isUpperCase(c))
         {
             ucount=ucount+1;
         }
         
     }
     System.out.println("uppercase count is"+ucount);
     System.out.println("lowercase is"+lcount);
    }  
}
