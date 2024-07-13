import java.util.Scanner;
public class Remainder { 
    public static void main (String[] args){ 
        int count = 0;
Scanner inputScanner = new Scanner (System.in);
System.out.println("Please enter the number you want to divide:");
int number = inputScanner.nextInt();
int another = number;
System.out.println("Please,enter the number you want to use for division");
int number1 = inputScanner.nextInt();
//I will write the code to do subtractions and counting the number of subtractions at the same time
while(number>number1){
    number = number-number1;
    count +=1;
}
System.out.println("If the number "+another +" is divided by "+number1+" it leaves a remainder "+number+" dividing it "+count+" times.");





inputScanner.close();
    }
 
}
