import java.util.Scanner;
public class Seventh {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner (System.in);
        int count = 0;
        int i;
        System.out.println("Please, enter the number you want to check if it's a prime");
        int number = inputScanner.nextInt();
        for (i = 2; i<=number;i++) {
            if (number%i==0) {
                count = count +1;
            }
            
        }
        if(count ==1) {
            System.out.println("It is prime");
        }



        inputScanner.close();
    }
}