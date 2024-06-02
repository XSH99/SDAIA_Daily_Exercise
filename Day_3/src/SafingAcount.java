


public class SafingAcount extends Acount{


    int limit = 5000;


    public SafingAcount(String s, double b) {
        super(s, b);
    }


    @Override
    public void withdraw(double amount){
        if(getBalance() - amount >= limit){
            super.withdraw(amount);
        }

    }

}
