package PracticeClass;

public class Main extends A{
    void msg(){
        System.out.println("Class main : welcome!");
    }
    public void msg1(){
        System.out.println("Overriding public method");
    }
    void msg2(){
        System.out.println("Overriding private method");
    }
    public void msg3(){
        System.out.println("Overriding protected method");
    }
    public static void main(String[] args) {
         A obj =new A();
         //obj.msg();  //ERROR
         obj.msg1();
         //obj.msg2(); //Error,private method cannot override
         obj.msg3();
    };

}
