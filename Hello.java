class Demo{
    int roll=556;
    String name="Prince Kumar Maurya";
    void show(){
        System.out.println(roll+" "+name);
    }
}
class Hello {
    public static void main(String[] args){
        Demo d=new Demo();
        d.show();
    }
}
