class Jio extends Sim
{
    @Override
    public void calling() {
        System.out.println("calling using Jio sim");
    }
}
class Airtel extends Sim
{
    @Override
    public void calling() {
        System.out.println("calling using Airtel sim");
    }
}
public class SimDetails {
    public static void main(String[] args) {
       Sim obj=new Jio();
       obj.calling();
       obj.messaging();
    } 
}
