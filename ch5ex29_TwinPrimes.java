/*
Twin primes are a pair of prime numbers that differ by 2.
For example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are
twin primes.
Write a program to find all twin primes less than 1000. Display the
output as follows:
(3, 5)
(5, 7)
...
 */
public class ch5ex29_TwinPrimes {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i) == true && isPrime((i + 2)) == true){
                System.out.println("(" + i + " , " + (i + 2) + ")");
            }

        }
    }
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isTwinPrime(int number){
        number += 2;
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }





}


