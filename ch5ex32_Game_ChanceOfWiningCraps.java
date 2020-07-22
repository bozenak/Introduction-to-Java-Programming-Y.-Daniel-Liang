/*
Revise Exercise 5.30 to run it 5,000 times and display the number of winning games.
 */
public class ch5ex32_Game_ChanceOfWiningCraps {
    public static void main(String[] args) {
        int dice1 = 0, dice2 = 0, sum = 0, count = 0;

        for(int i =0; i<=5000;i++) {
            dice1 = rollDice1(dice1);
            dice2 = rollDice2(dice2);
            sum = sum(dice1, dice2);
            System.out.println(dice1 + " + " + dice2 + " = " + sum);

            if (lose(sum) == true) {
                System.out.println("You lose");
            } else if (win(sum) == true) {
                System.out.println("You win");
                count = count(count);
            } else {
                int point = sum;
                System.out.println("point is " + point);
                do {
                    dice1 = rollDice1(dice1);
                    dice2 = rollDice2(dice2);
                    sum = sum(dice1, dice2);
                    System.out.println(dice1 + " + " + dice2 + " = " + sum);
                    if (sum == 7) {
                        System.out.println("lose");
                        break;
                    }
                    if (sum == point) {
                        System.out.println("win");
                        count = count(count);
                        break;
                    }
                } while (sum != 7 || point != sum);

            }


        }
        System.out.println("Wining games: " + count);

    }

    public static int rollDice1(int num) {
        return (int) (1 + Math.random() * 6);
    }

    public static int rollDice2(int num) {
        return (int) (1 + Math.random() * 6);
    }

    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static boolean lose(int sum) {
        if (sum == 2 || sum == 3 || sum == 12)
            return true;
        else
            return false;
    }

    public static boolean win(int sum) {
        if (sum == 7 || sum == 11)
            return true;
        else
            return false;
    }
    public static int count(int count){
        count++;
        return count;
    }

}
