package abs;

import java.util.ArrayList;
import java.util.List;

public class Airport implements Wifi{

    public static void main(String[] args) {

        System.out.println(Jet.AGE);
        Jet jet = new Jet();
        jet.getAlt();

    }


    @Override
    public void turnWifiOn() {

    }
}
