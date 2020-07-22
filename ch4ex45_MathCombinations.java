/*
write a program that uses nested for loop to display all
possible combination of 1 and 0 for a three-input system:
000
001
010
...
 */
public class ch4ex45_MathCombinations {
    public static void main(String[] args) {
        int zero = 0, one = 1;
        int digit1 = zero, digit2 = zero, digit3 = zero;
        int count1stDigit =0, count2ndDigit = 0;

        //there will be 8 combination because 3^2= 9, and it's starting count from 0
        for (int i =0; i<=7; i++){

            // print 1st digit (0) four time, if the count of 1st digit is 4,
            // then change 1st digit to 1, and if it's 1, change to 0
                System.out.print(digit1);
                count1stDigit++;
                if (count1stDigit == 4 && digit1 == zero){
                    digit1 = one;
                    count1stDigit =0;
                }
                else if(count1stDigit == 4 && digit1 == one){
                    digit1 = zero;
                    count1stDigit = 0;
                }

            // print 2nd digit (0) two time, if the count of 2nd digit is 2,
            // then change 2nd digit to 1, and if it's 1, change to 0
                for( int x=0; x<1; x++) {
                    System.out.print(digit2);
                    count2ndDigit++;
                    if (count2ndDigit == 2 && digit2 == zero) {
                        digit2 = one;
                        count2ndDigit = 0;
                    } else if (count2ndDigit == 2 && digit2 == one) {
                        digit2 = zero;
                        count2ndDigit = 0;
                    }
                    // print 3rd digit, if 3rd digit is 0 change it to 1
                    //and if it's 1 change to 0
                    for (int y = 0; y < 1; y++) {
                        System.out.print(digit3);
                        if (digit3 == zero) {
                            digit3 = one;
                        } else if (digit3 == one) {
                            digit3 = zero;
                        }
                    }
                }
                //print a new line every iteration
                System.out.print("\n");

        }
    }
}

