import java.util.Scanner;

/*
Write a method to display a pattern as follows:
1
1 2
1 2 3
1 2 3 4
...
1 2 3 4 5 ... n
 */
public class ch5ex6_DisplayPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = input.nextInt();
        displayPattern(n);
    }

    public static void displayPattern(int n){
        int i,j,num;
        for( i=0; i<n;i++){ //loop for counting rows
            num=1;
            for(j=0; j<=i; j++){ //loop for printing numbers
                System.out.print(num+ " ");
                num++;
            }
            System.out.println(); //move cursor to the ext line
        }



    }



}
