package PdfNote.ExceptionHandling;

public class AllExceptionFunction {
    public static void main(String[] args) throws Exception {
        int arr[]=new int[2];
        try {
            for(int i=0;i<4;i++)
            {
                arr[i]=i;
            }
            System.out.println(arr);
        }catch (Exception e)
        {
            System.out.println("fillIn : "+e.fillInStackTrace());
            System.out.println("cause : "+e.getCause());
            System.out.println("local : "+e.getLocalizedMessage());
            System.out.println("msg : "+e.getMessage());
            System.out.println("trace : "+e.getStackTrace());
            System.out.println();
            System.out.println();
            System.out.println("trace : ");e.printStackTrace();
            System.out.println();
            System.out.println("string : ");e.toString();
            System.out.println();
            System.out.println();
            System.out.println("oops , we went too far");
            throw (Exception) new Exception().initCause(e);
        }finally {
            System.out.println(arr);
        }
    }
}
