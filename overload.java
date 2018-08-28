class ovr
{
void print(String str)
  {
    System.out.println("Null arguments");
  }
void print(int n)
  {
   System.out.println(n);
  }
void print(double n2)
  {
   System.out.println(n2);
  }
}

class overloadd
{
public static void main(String[] args)
 {
  ovr x=new ovr();
  x.print("null");
  x.print(5);
  x.print(5.5);
 }
}