package staticClass;



import java.util.*;

import static java.util.Arrays.*;
import static staticClass.Pi.*;

public class ImportingStatic {


    public static void main(String[] args) {
        int [] a = {3,2,4,1};
        sort(a);
        System.out.println(PI);
        System.out.println(zero);
        System.out.println(Arrays.toString(a));
    }


}
