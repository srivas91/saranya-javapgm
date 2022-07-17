class College
{
    private String name="thirumurugan college";
    class Dept
    {
        String dname="CSE";
        void display()
        {
            System.out.println("college name is"+name);
            System.out.println("dept name is"+dname);
        }
    }
}
public class InnerDemo {

    public static void main(String[] args) {
        College cobj=new College();
        College.Dept d=cobj.new Dept();
        d.display();
    }    
}
