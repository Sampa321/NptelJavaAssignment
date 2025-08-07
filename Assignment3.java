package NPTELqs.Assignment.Week3;

//count digit
/* Input:153 output:3
Input:0003452 output:4 */

public class Assignment3 {
    public static void main(String[] args) {
        int n=0003452;
        int count = 0;
        while (n!=0)
        {
            int r=n%10;
            if(r!=0)
            {
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
