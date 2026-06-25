public class ReversingNumber {
    public static void main(String [] args){
        int num = 4527;
        int temp = num;
        int reverse = 0;
        
    while(num != 0){
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num/10;
    } 
    System.out.println("The Reverse of " + temp + " is " + reverse);   
    }

}
