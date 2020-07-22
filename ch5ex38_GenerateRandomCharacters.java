import java.util.Random;

/*
Use the methods in RandomCharacter in Listing 5.10
to print 200 uppercase letters and then 200 single digits,
printing ten per line.
 */
public class ch5ex38_GenerateRandomCharacters {
    public static void main(String[] args) {
        final int CHAR_PER_LINE = 10;
        int count = 0;

        for(int i=0; i<200; i++){
            System.out.print(getRandomUpperCaseLetter() + " ");
            count++;
            if (count % CHAR_PER_LINE == 0)
                System.out.println();
        }
        for(int i=0; i<200; i++){
            System.out.print(getRandomDigitCharacter() + " ");
            count++;
            if (count % CHAR_PER_LINE == 0)
                System.out.println();
        }



    }
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 +1));
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A','Z');
    }
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');
    }
}
