import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to cheack it's a Prime Number or not");
        int num = sc.nextInt();
        int count = 0;
        int i = 1;
        while(i<=num){
            if(num % i == 0){
                count++;
            }
            i++; 
    }
      if(count==2){
                System.out.println("Number entered by you is prime number");
            }
            else{
                System.out.println("Number is not prime");
            }
        }
}


