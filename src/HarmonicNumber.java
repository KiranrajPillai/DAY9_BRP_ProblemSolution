import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        double n = sc.nextDouble();
        double sum=0;
        double i;
        for(i=1; i<=n; i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("Harmonic value = "+sum);
    }
}