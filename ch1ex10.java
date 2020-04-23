public class ch1ex10 {
    public static void main(String[] args) {
        double avgKM = 14;
        double time = 45.5;
        double avgTimeKm;
        double avgTimeMiles;

        avgTimeKm = avgKM * 60 /  time;
        System.out.println("Average speed in km = " + avgTimeKm);

        avgTimeMiles = avgTimeKm / 1.6;
        System.out.println("Average time in Miles per hour = " + avgTimeMiles);

    }
}
