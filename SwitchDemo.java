enum Course{JAVA,PYTHON,PHP};
public class SwitchDemo {
    public static void main(String[] args) {
     int amount=23;
     String name="saranya";
     Course c=Course.JAVA;
            
      switch(c)
      {
          case JAVA:
              System.out.println("course java");
              break;
          case PYTHON:
              System.out.println("course python");
              break;    
          default:
              System.out.println("default");
      }
    }
    
}
