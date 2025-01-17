import java.util.Scanner;

public class TwinPrime {
    public static void main(String[] args) {
        // Declaring the scanner
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the number below which you want to check all the twin primes");
        int number = inputScanner.nextInt();
        inputScanner.close();

        for (int i = 2; i <= number - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
