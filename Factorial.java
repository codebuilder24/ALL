import java.util.Scanner;
public class Factorial {
    public static void main (String[] args) {
        int i;
        int real;
        //This code is used to find the factorial of a number
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the factorial whose number you want to find:");
        int number = inputScanner.nextInt();
         {
            for (i = 0;i<=number;i++) {
                 real = number - i;
                
                 if (number ==calculateFactorial(real)) {
                System.out.println(real);

                 }


            
            }
        }
            
        



        inputScanner.close();
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
