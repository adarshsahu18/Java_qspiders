import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number whose digit you want to add: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0; // result variable

        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println("sum of " + temp + " is " + sum);

        
    }
}
