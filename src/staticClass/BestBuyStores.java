package staticClass;
import static staticClass.BestBuy.*;

public class BestBuyStores {

    public static void main(String[] args) {

//        BestBuy storeOne = new BestBuy();
//        BestBuy storeTwo = new BestBuy();

        BestBuy.printComputer();
        System.out.println(numOfComputers);

    //    System.out.println(storeOne.numOfComputers);
    //    storeOne.numOfComputers --;
        BestBuy.numOfComputers -= 5;
       // System.out.println(storeTwo.numOfComputers);
        BestBuy.printComputer();

    }
}
