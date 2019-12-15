package inheritancePart2;

import java.lang.*;

public class Sun  {

    public static void main(String[] args) {

         Lenovo lenovo = new Lenovo();
         lenovo.model = "Lenovo X4";
         lenovo.memorySize = 512;
         lenovo.color = "Grey";

         lenovo.turnOn();
         Lenovo.s();

    }

}
