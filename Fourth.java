import java.util.Scanner;
public class Fourth {
    public static void main (String[] args){
        //A code that will be used to calculate the mean and median after being given inputs from the user
        double sum = 0;
        Scanner inputScanner  = new Scanner (System.in);
        System.out.println("Please enter the number of Elements you wantto have inside your array");
        int num = inputScanner.nextInt();
        double mainArray[] = new double [num];
        System.out.println("Please, enter "+num+"values in decreasing order");
        for(int i = 0; i<num ; i++) {
            mainArray[i] = inputScanner.nextInt();
        }
        System.out.println("For you to be sure of your inputs, type 'y' to print the array or otherwise");
        String option = inputScanner.next();
        if (option.equals("y")) {
            for(int i=0; i<num;i++) {
                System.out.println(mainArray[i]);
            } 
        }else {
            System.out.println("Let's move on to the next code");
        }
        //The formula for mean is sum of all the data inside the array divided by the total number of elements you have inside your array
        //Calculating the sum
        for(int i = 0 ; i<num ;i++) {
            sum = sum + mainArray[i];
       }
       double mean  = sum/num;
       System.out.println("The mean is:"+mean);




        inputScanner.close();
    }
}
