//Find the smallest n such that n^3 >1000
/*
Use a for loop to find the smallest
integer n such that n^3 is greater than 1000.
 */
public class ch4ex12_FindTheSmallestN {
    public static void main(String[] args) {
        int n = 0;


      for(n=0; (Math.pow(n,3) <= 1000); n++){
          }
        System.out.println("smallest n such that n^3 >1000 is " +n);
      }

    }




