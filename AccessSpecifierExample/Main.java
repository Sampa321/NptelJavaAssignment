package PracticeClass;

public class Main extends BaseClass{
    public static void main(String[] args) {
         BaseClass bs = new BaseClass();
         bs.z=0;
         Main obj = new Main();
         //public access specifier
        System.out.println(obj.x);//10
        obj.setA(20);
        System.out.println(obj.x);//10
        //protected access specifier
        System.out.println(obj.z);//10
        obj.setZ(30);
        System.out.println(obj.z);//30
        //for default access specifier
        System.out.println(obj.a);//20
        obj.setA(20);
        System.out.println(obj.a);//20
        //private access specifier can not store value
        //System.out.println(obj.y);

    };

}
