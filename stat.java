import java.util.Scanner;
class reck
{
static int x;
static
 {
  x=47;
  System.out.println("Static block called ");
 }
}
class stat
{
public static void main(String[] args)
  {
    System.out.println(reck.x);
  }
}