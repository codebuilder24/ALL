import java.util.Scanner;
public class Factorial {
    public static void main (String[] args) {
        int i;
        int real;
        //This code is used to find the factorial of a number
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the factorial whose number you want to find:");
        int number = inputScanner.nextInt();
        while (number>=0) { {
            for (i = 0;i<=number;i++) {
                 real = number - 1;
                
                 if (number ==sub(real)) {
                System.out.println(real);
                 }
            
            }
        }
            
        }



        inputScanner.close();
    }

    public static int sub (int real ) {
        //Crafting a code that solves for the factorial of a number
        int y;
        int factorial;
        for (y=0;y<=real;y++) {
             factorial  = (real-y);

        }
        return (factorial);
    }
    
}
