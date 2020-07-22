/*
A prime number is called a Mersenne prime if it can be written
in the form 2^p - 1 for some positive integer p.
Write a program that finds all Mersenne primes with p <= 31 and displays the output as follows:
p   2^p – 1
2   3
3   7
5   31
...
 */
public class ch5ex28_MersennePrime {
    public static void main(String[] args) {
        int p = 0;
        System.out.println("p   2^p – 1");
        System.out.println("-----------");
        for(p=2; p<=31; p++){
            if(isPrime(p) == true ){
                System.out.printf("%-4d", p);
                System.out.print(isMersennePrime(p));
                System.out.println();
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
    public static int isMersennePrime (int number){
        return (int)(Math.pow(2 ,number) - 1) ;
        }

}
