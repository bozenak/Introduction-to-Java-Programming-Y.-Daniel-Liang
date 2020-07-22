/*
Listing 5.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime.
Use this method to find the number of prime numbers less than 10000.
 */
public class ch5ex10_isPrimeMethod {
    public static void main(String[] args) {
        System.out.println("The number of prime numbers less than 10000. \n");
        printPrimeNumbers(10000);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OFpRIMES_PER_LINE = 10; //display 10 number per line
        int count = 0; // count the number of primes
        int number = 2; //number to be tested for primes
        while (count < numberOfPrimes && number <= 10000) { //find prime numbers less then 10000
            if (isPrime(number)) {
                count++; //increase count
                if (count % NUMBER_OFpRIMES_PER_LINE == 0) {
                    System.out.printf("%-8s\n", number); //print the number and move cursor to the next line
                } else {
                    System.out.printf("%-8s", number); // print the number
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
