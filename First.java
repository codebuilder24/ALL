import java.util.Scanner;

public class First {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please, Enter the number you want to swap");
        int num1  = inputScanner.nextInt();
        int num2 = inputScanner.nextInt();
        int num3;
        num3 = num1;
        num1 =num2;
        num2 = num3;
        System.out.println("The First Number Is Now "+num1+"The Second Number Is Now "+num2);

    inputScanner.close();
    }
}