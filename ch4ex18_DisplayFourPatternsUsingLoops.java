/*
Use nested loops that display the following
patterns in four separate programs:
Pattern A       Pattern B       Pattern C       Pattern D
*********       *****                *               *
*********       *****               ***             * *
*********       ** **              *****           * * *
...             *****               ***             * *
...             *****                *               *
 */
public class ch4ex18_DisplayFourPatternsUsingLoops {
    public static void main(String[] args) {

        String patternA = "Pattern A";
        String patternB = "Pattern B";
        String patternC = "Pattern C";
        String patternD = "Pattern D";


        char star = '*';
        char dot = '.';
        char space = ' ';
        int numOfLines;
        int numOfStars;
        int numOfDots;
        int numOfSpaces;


        //Pattern A
        System.out.println(patternA);
        for(numOfLines=0; numOfLines <= 2; numOfLines++){       //display 3 lines
            for(numOfStars = 0; numOfStars <= 9; numOfStars++){ //display 9 stars in line
                System.out.print(star);
            }
            System.out.print("\n");
        }
        for(numOfLines=0; numOfLines <= 1; numOfLines++){       //display 2 lines
            for(numOfDots = 0; numOfDots <= 3; numOfDots++){    // display3 dots
                System.out.print(dot);
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        //Pattern B
        System.out.println(patternB);
        for(numOfLines=0; numOfLines <= 1; numOfLines++){       //display 3 lines
            for(numOfStars = 0; numOfStars <= 5; numOfStars++){ //display 9 stars in line
                System.out.print(star);
            }
            System.out.print("\n");
            }
            for(numOfLines = 0; numOfLines<=1; numOfLines++){ // display 1 line with 2 stars and space
                System.out.print(star);
                System.out.print(star);
                System.out.print(space);
            }
        System.out.print("\n");
        for(numOfLines=0; numOfLines <= 1; numOfLines++){       //display 3 lines
            for(numOfStars = 0; numOfStars <= 5; numOfStars++){ //display 9 stars in line
                System.out.print(star);
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        //Pattern C
        System.out.println(patternC);
        for(numOfLines = 1; numOfLines <= 3; numOfLines++){ // display 3 lines
            for (numOfSpaces = 1; numOfSpaces <= 3 - numOfLines; numOfSpaces++){
                System.out.print(space);
            }
            numOfSpaces--;

            for(numOfStars = 1; numOfStars <= 2 * numOfLines - 1; numOfStars++){
                System.out.print(star);
            }
            System.out.print("\n");
        }


        for(numOfLines = 2; numOfLines >0; numOfLines--){ // display 2 lines
            for (numOfSpaces = 0; numOfSpaces <= 2 - numOfLines; numOfSpaces++){
                System.out.print(space);
            }
            numOfSpaces--;
            for(numOfStars = 1; numOfStars <= 2 * numOfLines - 1; numOfStars++){
                System.out.print(star);
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        //Pattern D
        System.out.println(patternD);
        for(numOfLines = 1; numOfLines <= 3; numOfLines++){
            for (numOfSpaces = 1; numOfSpaces <= 3 - numOfLines; numOfSpaces++){
                System.out.print(space);
            }

            for(numOfStars = 1; numOfStars <= numOfLines; numOfStars++){
                System.out.print(star + " ");
            }
            System.out.print("\n");
        }

        for(numOfLines = 2; numOfLines >0; numOfLines--){
            for (numOfSpaces = 0; numOfSpaces <= 2 - numOfLines; numOfSpaces++){
                System.out.print(space);
            }
            numOfSpaces--;
            for(numOfStars = 1; numOfStars <=numOfLines; numOfStars++){
                System.out.print(star + " ");
            }
            System.out.print("\n");
        }









    }
}
