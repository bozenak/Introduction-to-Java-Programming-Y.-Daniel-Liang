//random character
/*
Write a program to display random lowercase letter using Math.random() method
 */
public class ch3ex16 {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * ((122 - 97) + 1) + 97);
        //System.out.println(randomNum);
        char character = (char)randomNum;
        System.out.println(character);
    }
}
