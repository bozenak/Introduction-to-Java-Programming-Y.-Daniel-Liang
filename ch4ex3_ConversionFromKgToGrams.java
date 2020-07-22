/*
Write a program that displays the following
table (note that 1 kilogram is 1000 grams):
Kilograms   Grams
1           1000
2           2000
...
24          24000
25          25000
 */
public class ch4ex3_ConversionFromKgToGrams {
    public static void main(String[] args) {

        int kg =0;
        int g = 0;

        System.out.println("For loop");
        System.out.println("Kilograms       Grams");
        for(kg=1; kg <= 25; kg++){
            g = kg * 1000;
            System.out.printf ("%-16d%-16d\n" , kg, g);
        }

        kg=1;
        System.out.println("While loop");
        System.out.println("Kilograms       Grams");
        while(kg <= 25){
            //kg = 1;
            g = kg * 1000;
            System.out.printf ("%-16d%-16d\n" , kg, g);
            kg++;
        }

        kg=1;
        System.out.println("Do-While loop");
        System.out.println("Kilograms       Grams");
        do{
            g = kg * 1000;
            System.out.printf ("%-16d%-16d\n" , kg, g);
            kg++;
        } while (kg <= 25);

    }
}
