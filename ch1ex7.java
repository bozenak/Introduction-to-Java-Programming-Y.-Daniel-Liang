public class ch1ex7 {
    public static void main(String[] args) {
        //double a = 1.0;
        double pi;
        double pi2;

        pi = 4 * (((1.0 - (1.0/3)) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        System.out.println(pi);

        pi2 = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13)) ;
        System.out.println(pi2);
    }
}
