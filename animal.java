class Animal
{
String breed;
String color;
void speak()
{
  System.out.println("Every animal has different behaviours");
}
}
class Dog extends Animal
{
void speak()
{
System.out.println("Dogs are loyal");
}
}
class Cat extends Animal
{
void speak()
{
 System.out.println("Cats are selfish");
}
}
class Main
{
public static void main(String[] args)
{
 Animal obj=new Animal();
 obj.speak();
 obj=new Dog();
 obj.speak();
 obj=new Cat();
 obj.speak();
}
}