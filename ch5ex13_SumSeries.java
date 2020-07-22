/*
Write a method to compute the following series:
m(i) = 1/2 + 2/3 + ... + i/i+1
Write a test program that displays the following table:
I       m(i)
--------------------
1       0.3333
2       0.8333
...
19      14.7093
20      15.6184
 */
public class ch5ex13_SumSeries {
    public static void main(String[] args) {
        double m = 0;
        double sum = 0;
        System.out.println("I       m(i)");
        System.out.println("-----------------");

        for(int i =1; i<=20; i++){
            System.out.printf("%-8d", i);
            m = CalculateI(i);
            sum = sum + m;
            System.out.printf("%.4f\n", sum);

        }

    }
    public static double CalculateI (double i){
        return i/(i+1);
    }
}
