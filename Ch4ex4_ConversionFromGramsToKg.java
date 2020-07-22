
/*
Write a program that displays the following
table (note that 1000 grams is 1 kg):
Grams       Kilograms
1000           1
2000           2
...
24000          24
25000          25
 */
public class Ch4ex4_ConversionFromGramsToKg {
    public static void main(String[] args) {
        int g;
        int kg;

        System.out.println("For loop");
        System.out.println("Grams        Kilograms");
        for(g=1000; g <= 25000; g += 1000){
            kg = g / 1000;
            System.out.printf("%-13d%-6d\n", g , kg);
        }

        kg = 0;
        g = 1000;
        System.out.println("While loop");
        System.out.println("Grams        Kilograms");
        while(g <= 25000){
            kg = g / 1000;
            System.out.printf("%-13d%-6d\n", g , kg);
            g += 1000;
        }


        kg = 0;
        g = 1000;
        System.out.println("Do-While loop");
        System.out.println("Grams        Kilograms");
        do{
            kg = g / 1000;
            System.out.printf("%-13d%-6d\n", g , kg);
            g += 1000;
        } while (g <= 25000);

    }
}
