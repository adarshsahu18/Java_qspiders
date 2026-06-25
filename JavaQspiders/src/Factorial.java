import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to find factorial of:5 ");
        int num = sc.nextInt();
        int fact = 1;
        int i = 1;
        while(i <= num){
            fact = fact * i;
            i++;
    
        }
         System.out.println("factorial of " + num + " is " +fact);

    }

}
