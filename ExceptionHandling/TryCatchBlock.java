package PracticeClass;

public class TryCatchBlock {
    public static void main(String[] args) {
        int i=0;
        String greeting[]={"Hello ","world","Hello world"};
        while (i<4)
        {
            try {
                System.out.println(greeting[i]);
                i++;
            }catch (Exception e)
            {
                System.out.println(e.toString());
            }
            finally {
                System.out.println("Hi!");
                if(i<3);
                else {
                    System.out.println("You should quit and reset index value");
                    break;
                }
            }//finally ene
        }//while end
    }//main() end
}//class end
