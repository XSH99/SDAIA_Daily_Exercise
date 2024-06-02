public class mymethods {

    public static double calculatePCT(double marks , double fullmarks){

        return marks / fullmarks * 100 ;
    }


    public static String getgrade(double pct){

        if(pct > 85)return "Exslent";
       else if(pct > 75)return "very good";
        else if(pct > 65)return "good";
        else if(pct >= 50)return "pass";
        else return "fill";

    }

//    public static String[] getgrade(double[] pctall){
//      var grade = new String[pctall.length];
//
//      for (int i = 0 ; i < pctall.length; i++) {
//          var pct = pctall[i];
//          if (pct > 85) grade[i] "Exslent";
//          else if (pct > 75) grade[i] "very good";
//          else if (pct > 65) grade[i] "good";
//          else if (pct >= 50) grade[i] "pass";
//          else grade[i] "fill";
//      }
//    }


    // method to count the rate
    public static double calculateRate(double rate){

        return rate / 12 ;
    }

    // method to count the balance
    public static double calculatebalancr(double balance, double rate){

        return balance * rate;
    }


}
