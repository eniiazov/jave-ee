package polymorphism;

public class ZelleTransfer implements MobileVerifieable{

    @Override
    public boolean verify() {
        System.out.println("Zelle is verifying the transfer");
        return true;
    }
}
