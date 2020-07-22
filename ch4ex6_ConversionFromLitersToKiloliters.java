/*
Write the program that displays the following two tables side by side,
(note that 1 kiloliter is 1000 liters and
1 liter is .001 kilolitre
Liters      Kiloliters  |   Kiloliters     Liters
1           0.001       |   1              1000
2           0.002       |   2              2000
...
9           0.009       |   9              9000
10          0.010       |   10             10000
 */
public class ch4ex6_ConversionFromLitersToKiloliters {
    public static void main(String[] args) {
        System.out.printf("Liters        Kiloliters   |    Kiloliters        Liters \n");
        double liter;
        double kiloliter;
        String space = "    |    ";


        System.out.println("For loop");
        for (liter = 1, kiloliter = 1; liter <= 10; liter++, kiloliter++) {
            //kiloliter = liter / 1000;

            System.out.printf("%-14.0f %-7.3f %8s %-16.0f %-14.0f \n", liter, (liter / 1000), space, kiloliter, (kiloliter * 1000));
        }

        System.out.println("While loop");
        liter = 1;
        kiloliter = 1;
        while (liter <= 10){
            System.out.printf("%-14.0f %-7.3f %8s %-16.0f %-14.0f \n", liter, (liter / 1000), space, kiloliter, (kiloliter * 1000));
            liter++;
            kiloliter++;
        }

        System.out.println("Do-While loop");
        liter = 1;
        kiloliter = 1;
        do{
            System.out.printf("%-14.0f %-7.3f %8s %-16.0f %-14.0f \n", liter, (liter / 1000), space, kiloliter, (kiloliter * 1000));
            liter++;
            kiloliter++;
        }while(liter <= 10);

    }
}


