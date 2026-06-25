// a number where the sum of digit is equals to the product of its digit

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number whose digit you want to add: ");
        int num = sc.nextInt();
        int temp = num;
        int product = 1;
        int sum = 0;

    while(num!= 0){
        int digit = num % 10;
        product = product * digit;
        sum = digit + sum;
        num = num/10;
    }
    System.out.println(sum == product ? temp + " is Spy number" : temp + " is not spy number");
    }

}
