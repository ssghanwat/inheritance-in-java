import java.lang.*;

/*
class Object
{
  //contents
}
*/

class Base               //class Base extends object
{
   public int i;
   public int j;
   
   
   public void fun()
   {
      System.out.println("Inside Base fun");
   }
   
 
}
class Derived extends Base               //class Derived : public Base
{
   public int x;
   public int y;
   
  
   public void sun()
   {
       System.out.println("Inside Derived Sun");
       
   }
}

class Derivedx extends Derived
{
   public int a;
   
   public void sun()
   {
     System.out.println("Inside Derivedx sun");
   }
}
class Inheritance3
{
   public static void main(String a[])
   {
       System.out.println("Inside main");
       Derived dobj=new Derivedx();
       dobj.sun();
   }
}
