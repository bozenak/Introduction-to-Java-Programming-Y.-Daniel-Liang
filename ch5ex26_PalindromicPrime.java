/*
A palindromic prime is a prime number and also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313 and 757.
Write a program that displays the first 120 palindromic prime numbers. Display
10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
 */
public class ch5ex26_PalindromicPrime {
    public static void main(String[] args) {
        int n = 120;
        printPrimePalindromeNumbers(n);
    }
    public static void printPrimePalindromeNumbers(int numberOfPrimes) {
        final int NUMBER_OFpRIMES_PER_LINE = 10; //display 10 number per line
        int count = 0; // count the number of primes
        int number = 2; //number to be tested for primes
        while (count < numberOfPrimes) { //find prime numbers less then 10000
            if (isPrime(number) && isPalindrome(number) == true) {
                count++; //increase count
                System.out.print(number + " "); // print the number
                if (count % NUMBER_OFpRIMES_PER_LINE == 0) {
                    System.out.println();
                    //System.out.print(number + " "); //print the number and move cursor to the next line
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
    public static int reverse(int number){
        int remainder;
        int reverseNum =0;
        int originalNumber = number;
        while(originalNumber > 0) {
            remainder = originalNumber % 10;
            reverseNum = reverseNum * 10 + remainder;
            originalNumber = originalNumber / 10;
        }
        return reverseNum;
    }
    public static boolean isPalindrome(int number){
        return number == reverse(number) ? true : false;
    }
}

