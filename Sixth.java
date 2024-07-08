import java.util.Scanner;

public class Sixth {
    public static void main(String[] args){
        //A code that counts the number of times a particular digit appears in an integer
        int i = 1;
        int count = 0;
        int sum;
        int useNum;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Write the number for which you want to check if other digits can enter:");
        int integer = inputScanner.nextInt();
        useNum = integer;
        while (i<=integer) {
            //Subtract and count. When it enters into negative , stop and give the previous value that will be left before subtracting and getting negative
            for(;integer-i >= 0;) {
                sum = integer - i;
                count = count+1;
                integer = sum;
            }
            System.out.println("The number of count is "+count+" for integer:"+i+"\nThe last mumber is :" +(integer));
            integer = useNum;
            count = 0;
            i++;
        }




        inputScanner.close();
    }
}
