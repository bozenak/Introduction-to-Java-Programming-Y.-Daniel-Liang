import java.util.Scanner;

/*
Write a method that displays an n-by-n matrix using the following header:
public static void printMatrix(int n)
Each element is an integer between 0 and 8, which is generated randomly.
Write a test program that prompts the user to enter n
and displays an n-by-n matrix. Here is a sample run:
Enter n: 3
2 1 5
7 0 6
5 6 8
 */
public class ch5ex17_DisplayMatrixOf0To8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        printMatrix(n);

    }
    public static void printMatrix(int n){
        int row = 0;
        int column = 0;
        int count = 0;

        for(row=0; row<n; row++){
            for(column=0; column<n;column++){
                int number = (int)(Math.random() * 9);
                System.out.print(number + " ");
                count++;
                if (count % n == 0)
                    System.out.println();
            }
        }



    }
}
