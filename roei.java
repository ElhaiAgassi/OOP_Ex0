import java.util.Scanner;

public class roei {
    public static void main(String[] args) {
        int num1, num2, temp, gcd = 0, count = 0;
        System.out.println("enter a number:");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        System.out.println("enter the next num");
        num2 = scan.nextInt();
        while (num2 != 0) {
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;

            gcd = num1;
        }
        if (gcd <= 1) {
            System.out.println("\n GCD =  " + gcd);
        }
        for (int i = 2; i < Math.sqrt(gcd); i++) {
            if (gcd % i == 0) {
                System.out.println(count);
            }
            else{
               System.out.println("\n GCD =  " + gcd);

            }}
    }

}