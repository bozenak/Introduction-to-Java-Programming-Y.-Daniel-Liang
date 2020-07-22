//Find the larges n such that n^2 <1000
/*
Use a for loop to find the largest
integer n such that n^2 is less than 1000.
 */
public class ch4ex13_FindTheLargesN {
    public static void main(String[] args) {


    int n;

    for (n=0; (Math.pow(n,2) <= 1000); ) {
        n++;
    }
        n = n - 1;
        System.out.println("largest n such that n^2 <1000 is " +n);

    }
}
