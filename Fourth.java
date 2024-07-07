import java.util.Scanner;
public class Fourth {
    public static void main (String[] args){
        //A code that will be used to calculate the mean and median after being given inputs from the user
        Scanner inputScanner  = new Scanner (System.in);
        System.out.println("Please enter the number of Elements you wantto have inside your array");
        int num = inputScanner.nextInt();
        int mainArray[] = new int [num];
        System.out.println("Please, enter "+num+"values in decreasing order");
        for(int i = 0; i<num ; i++) {
            mainArray[i] = inputScanner.nextInt();
        }
        System.out.println("For you to be sure of your inputs, type 'y' to print the array or otherwise");



















        inputScanner.close();
    }
}
