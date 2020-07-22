/*
Write a program to sum the following series:
1/25 + 2/24 + 3/23 + ... + 25/1
 */
public class ch4ex24_SumASeries {
    public static void main(String[] args) {
        double n = 1.0;
        double m = 25.0;

        double sum = 0;

        for ( n = 1, m = 25; m >= 1; n++, m--) {
            sum = sum + n/m;
        }
        System.out.print("1/25 + 2/24 + 3/23 + ... + 25/1 = " + sum);


    }
}
