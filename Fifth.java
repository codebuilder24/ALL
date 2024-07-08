import java.util.Scanner;
public class Fifth {
    public static void main (String[] args) {
        //This code takes in a positive integer and prints the sum of the first n even integers and the sum of the first n odd numbers
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = inputScanner.nextInt();
        System.out.println("The sum of the  first "+num+ " even positive numbes are");
        even(num);
        System.out.println("The sum of the first "+num+"odd positive numbers are");
        odd(num);
        inputScanner.close();
    }
    public static void odd (int x){
        int newArray [] = new int [x];
        int sum = 1;
        int count = 0;
        int i = 0;
        for (; i<x;i++) {
            sum = sum+2;
            newArray[i] = sum;
            count = count + newArray[i];
        }
        System.out.println(count);
    }

    public static void even (int x){
        int newArray[] = new int [x];
        int sum = 0;
        int count = 0;
        int i = 0;
        for (; i<x;i++){
            sum = sum +2;
            newArray[i] = sum;
            count = count +newArray[i];
        }
        System.out.println(count);

    }
    }
