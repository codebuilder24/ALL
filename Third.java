import java.util.Scanner;
public class Third  {
    public static void main (String [] args){
        Scanner inputScanner = new Scanner(System.in);
        int i;
        System.out.println("Enter The Number Of Elements You Want To Store:");
        int arraySize = inputScanner.nextInt();
        int [] numArray = new int [arraySize] ;
        System.out.println("Enter " + arraySize+ " numbers ");
        for(i = 0;i<arraySize;i ++) {
            numArray[i]= inputScanner.nextInt();
        }
        System.out.println("Please , enter the number whose position you want to check:");
        int num = inputScanner.nextInt();
        for(i=numArray.length-1; i>=0;i--) {
            if(num ==numArray[i]) {
                System.out.println("The position of the last occurance is in the index " +i+" and that's the "+(i+1)+" position" );
                break ;
            }
        }
        
    }
}