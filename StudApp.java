record Student(int id,String name,String course){}
//class Student
//{
//    private int id;
//    private String name,course;
//
//    public Student(int a, String b, String c) {
//        id = a;
//        name = b;
//        course = c;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%d %s %s",id,name,course);
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }
//    
//    
//    
//}


public class StudApp {

    public static void main(String[] args) {
       Student s1=new Student(1001,"ramya","java");
       s1.setId(222);
//        System.out.println("student-1 detail is"+s1);
       System.out.println(s1.getId());
    }
    
}
