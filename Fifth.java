import java.util.Scanner;
public class Fifth {
    public static void main (String[] args) {
        //This code takes in a positive integer and prints the sum of the first n even integers and the sum of the first n odd numbers
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = inputScanner.nextInt();
        System.out.println("The sum of the  first "+num+ " even positive numbes are");
        even(num);
        inputScanner.close();
    }
    public static void odd (int x){
        int count = 0;
        int sum = 1;
        while (count<=x) {
            sum +=2;
            count +=1;   
        }
        System.out.println(sum);
    }

    public static void even (int x){
        int count = 0;
        int sum = 0;
        while (count<=x) {
            sum = sum+ 2;
            sum = 
            count +=1;
        }
        System.out.println(sum);
    }
}