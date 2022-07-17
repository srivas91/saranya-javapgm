public class SwitchDemo2 {
    public static void main(String[] args) {
          switch("java")
          {
              case "java","python"->System.out.println("programming");
              case "mysql","oracle"->System.out.println("database");
              default->System.out.println("default");
                      
          }
    }
}
