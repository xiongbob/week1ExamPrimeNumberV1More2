/*
 Write an application that will show the number range form 1 to max range
 and indicate the prime in the range for Option 1 enhancement more.
 */

import java.util.Scanner;

public class PrimeNumberV1More2 {
    public static void main(String[] args) {

        int i, num = 0;
        boolean isPrime = true;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the max range: ");
        int maxCheck = myObj.nextInt();
        myObj.nextLine();

        String primeNumbersFound = "";

        //Start loop 1 to maxCheck
        for (i = 1; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        System.out.println(primeNumbersFound);
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}
