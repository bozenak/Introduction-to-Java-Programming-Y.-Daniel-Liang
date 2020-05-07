// Print a table
/*
Write a program that displays the following table. Cast floating point
numbers into integers.
a   b   a + b   a * b
1   2   3       2
2   3   5       6
3   4   7       12
4   5   9       20
5   6   11      30
 */
public class ch2ex18 {
    public static void main(String[] args) {
        double a, b;
        a = 1;
        b = 2;
        System.out.println("a    b    a + b    a * b");
        System.out.println((int)a + "    " + (int)b + "    " + (int)(a + b) + "        " + (int)(a * b));
        a++;
        b++;
        System.out.println((int)a + "    " + (int)b + "    " + (int)(a + b) + "        " + (int)(a * b));
        a++;
        b++;
        System.out.println((int)a + "    " + (int)b + "    " + (int)(a + b) + "        " + (int)(a * b));
        a++;
        b++;
        System.out.println((int)a + "    " + (int)b + "    " + (int)(a + b) + "        " + (int)(a * b));
        a++;
        b++;
        System.out.println((int)a + "    " + (int)b + "    " + (int)(a + b) + "       " + (int)(a * b));
    }
}
