/*
An emirp (prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so
17 and 71 are emirps. Write a program that displays the first 120 emirps. Display
10 numbers per line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113
149 157 167 179 199 311 337 347 359 389
...
 */
public class ch5ex27_Emirp {
    public static void main(String[] args) {
        int n = 120;
        final int NUMBER_OFpRIMES_PER_LINE = 10; //display 10 number per line
        int count = 0; // count the number of primes

        for (int i = 2; count < n; i++) {
            if(isEmirp(i)){
                System.out.print(i + " ");
                count++;
                if (count % NUMBER_OFpRIMES_PER_LINE == 0) {
                    System.out.println();
                }
            }
        }
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

    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEmirp(int number){
        return (isPrime(number) && isPalindrome(number) == false && isPrime(reverse(number))) ? true : false;
    }

}








