/*
A  number is defined as n(n-1)/2 for n = 1 , 2 , and so on.
Therefore, the first few numbers are 0, 1, 3, 6 ...
Write a method with the following header that returns a number as defined above:
public static int getNumber(int n)
Write a test program that uses this method to display the
first 100 numbers with 10 numbers on each line.
 */
public class ch5ex1_MathNumberGeneration {
    public static void main(String[] args) {
        System.out.println("The first 100 numbers are: ");
        getNumber(100);
    }
    public static int getNumber(int n) {
        final int NUMBERS_PER_LINE = 10;  //display 10 numbers per line
        int count = 0; //count the numbers

        for (int i = 1; i <= n; i++) {
            int number = i * (i - 1) / 2;
            count++;
            System.out.printf("%7d", number);
            if (count == NUMBERS_PER_LINE){
                System.out.print("\n");
                count = 0;
            }
        }
        return n;
    }

}
