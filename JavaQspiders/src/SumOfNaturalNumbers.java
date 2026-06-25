
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int sum = 0;
        int i = 0;
        
        while(i<=num){
            sum = sum + i;
            i++;
        }
         System.out.println("sum of natural numbers is " + sum);

    }

}
