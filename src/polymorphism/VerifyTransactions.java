package polymorphism;

import java.util.ArrayList;

public class VerifyTransactions {

    public static void main(String[] args) {
        MobileVerifieable mv1 = new ZelleTransfer();
        MobileVerifieable mv2 = new MoneyGram();
        MobileVerifieable mv3 = new CreditCard();

        ArrayList<MobileVerifieable> transactions = new ArrayList<>();
        transactions.add(mv1);
        transactions.add(mv2);
        transactions.add(mv3);

        for(MobileVerifieable m: transactions){
            if(m.verify()){
                System.out.println("Transaction Success!");
            }else{
                System.out.println("Transaction Failed!");
            }
        }
    }
}
