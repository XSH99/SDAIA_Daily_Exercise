

public class CheekAcount extends Acount{


    public CheekAcount(String s, double b) {
        super(s, b);


    }

    @Override
    public void withdraw(double amount){
        if(getBalance() - amount >= 0){
            super.withdraw(amount);
        }
    }



}
