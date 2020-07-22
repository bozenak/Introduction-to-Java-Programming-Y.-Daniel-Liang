/*
Write a program that prints the following table using pow method in the Math class
Number      SquaredRoot
-----------------------
0           0.0
1           1.0
...
9           81.0
10          100.0
 */
public class ch5ex18_SquaredRoot {
    public static void main(String[] args) {
        System.out.println("Number      SquaredRoot");
        System.out.println("------------------------");
        int number = 0;
        for(number=0; number<=10; number++){
            System.out.printf("%-12d", number);
            System.out.printf("%.1f\n", CalculateSquaredRoot(number));
        }
    }

    public static double CalculateSquaredRoot(int number){
        return Math.pow(number, 2);
    }
}
