import java.util.Scanner;

public class mygread {

    public static void main(String[] args) {
     var sc = new Scanner(System.in);

        System.out.println("enter the marks and full marks please?");
         double m = sc.nextDouble();
         double f = sc.nextDouble();


         double pct = mymethods.calculatePCT(m,f);
         String thegrade = mymethods.getgrade(pct);
        System.out.println("your pct is " + pct + ", " + thegrade);

// compleat the ex for the past one





    }


}
