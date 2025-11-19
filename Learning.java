class A{
   int a=10;
   protected int b=20;
   private String name="Prince";
   protected void sum(){
      System.out.println("sum: "+(a+b));
   }
   void printName(){
      System.out.println("Name : "+name);
   }
}
class B extends A{
   void printClassAMember(){
      System.out.println("a : "+a);
      System.out.println("b : "+b);
   }
   void callMethodA(){
      sum();
      printName();
   }   

}
public class Learning{
   public static void main(String[] args){
      B obj=new B();
      obj.printClassAMember();
      obj.printName();
      A obj1=new A();
      System.out.println(obj1.b);
   }
}