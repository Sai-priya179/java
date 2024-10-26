abstract class vehicle
{
abstract void engine();
}
class car extends vehicle
{
public void engine()
{
System.out.println("car has good engine");
}
}
class truck extends vehicle
{
public void engine()
{
System.out.println("Truck has bad engine");
}
}
public class TestVehicle
{
public static void main(String arr[])
{
vehicle v = new car();
v.engine();
vehicle c = new truck();
c.engine();
}
}