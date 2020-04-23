public class ch1ex11 {
    public static void main(String[] args) {
        int currentPopulation = 312032486;
        int births;
        int deaths;
        int immigrants;
        int population1stYear;
        int population2ndYear;
        int population3rdYear;
        int population4thYear;
        int population5thYear;

        births = 365 * 24 * 60 * 60 / 7;
        System.out.println("Births every year=  " + births);

        deaths = 365 * 24 * 60 * 60 / 13;
        System.out.println("Deaths every year = " + deaths);

        immigrants = 365 * 24 * 60 * 60 / 45;
        System.out.println("Immigrants every year= " + immigrants);

        population1stYear = currentPopulation + births - deaths + immigrants;
        System.out.println("Population for 1st year is  " + population1stYear);

        population2ndYear = population1stYear + births - deaths + immigrants;
        System.out.println("Population for 2nd year is  " + population2ndYear);

        population3rdYear = population2ndYear + births - deaths + immigrants;
        System.out.println("Population for 3rd year is  " + population3rdYear);

        population4thYear = population3rdYear + births - deaths + immigrants;
        System.out.println("Population for 4th year is  " + population4thYear);

        population5thYear = population4thYear + births - deaths + immigrants;
        System.out.println("Population for 5th year is  " + population5thYear);
    }
}

