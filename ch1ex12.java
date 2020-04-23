public class ch1ex12 {
    public static void main(String[] args) {
        double avgMiles = 24.0;
        double time = 100.0;
        double avgTimeKm;
        double avgTimeMiles;

        avgTimeMiles = avgMiles * 60 /  time;
        System.out.println("Average speed in miles = " + avgTimeMiles);

        avgTimeKm = avgTimeMiles * 1.6;
        System.out.println("Average time in km per hour = " + avgTimeKm);

    }
}
