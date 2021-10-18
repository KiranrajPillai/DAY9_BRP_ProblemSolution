import java.util.Scanner;

public class CosAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        double a = sc.nextDouble();
        a = Math.toRadians(a);
        System.out.println(Math.cos(a));
    }
}
