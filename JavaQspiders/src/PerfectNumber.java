import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number that you want to check: ");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i<=num/2){
            if(num % i == 0){
                sum += i ;
            }
            i++;
        }
        if(sum == num){
            System.out.println(num + " is perfect number");
        }
        else{
            System.out.println(num + " is not perfect");
        }
    }

}
