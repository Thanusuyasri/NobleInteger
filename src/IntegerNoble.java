import java.util.Arrays;
import java.util.Scanner;

public class IntegerNoble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i] = scanner.nextInt();
        }
        int countSmall=0,countNobale=0;
        Arrays.sort(a);
        if(a[0]==0)
        {
            countNobale++;
        }
        for(int i=1;i<size;i++)
        {
            if(a[i]!=a[i-1])
            {
                countSmall=i;
            }
            if(countSmall==a[i])
            {
                countNobale++;
            }
        }
        System.out.println(countNobale);
    }
}
