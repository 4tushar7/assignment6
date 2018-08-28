class Vehicle
{
 void start()
 {
  System.out.println("Inside Start");
 }
 void stop()
 {
  System.out.println("Inside Stop");
 }
}

class Twowheeler extends Vehicle
{
 void start()
 {
 System.out.println("Inside Twowheeler Start");
 }
 void stop()
 {
 System.out.println("Inside Twowheeler Stop");
 }
}

class Fourwheeler extends Vehicle
{
 void start()
 {
  System.out.println("Inside Fourwheeler Start");
 }
 void stop()
 {
  System.out.println("Inside Fourwheeler Stop");
 }
}
class MainVehicle
{
public static void main(String[] args)
{
Vehicle x=new Vehicle();
Twowheeler obj1=new Twowheeler();
obj1.start();
obj1.stop();
Fourwheeler obj2=new Fourwheeler();
obj2.start();
obj2.stop();
}
}