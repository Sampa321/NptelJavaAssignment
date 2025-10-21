package PdfNote.ExceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int a =args.length;
            int b = 42/a; //divided by zero exception
            System.out.println("a = "+a);
            if(a==1)
            {
                a = a/(a-a); //divided by zero exception
            }
            try {
                if (a==1)
                {
                    int c[]={1};
                    c[2]=45;
                }
            }catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array index out of bound : "+e);
            }
        }catch (ArithmeticException e)
        {
            System.out.println("Divided by 0 : "+e);
        }
    }
}
