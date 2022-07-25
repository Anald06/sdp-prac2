package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

    public static boolean Task5(List<Integer> lst) {
        List<Integer> temp = new ArrayList<>(lst);
        java.util.Collections.sort(lst);
        return temp.equals(lst);
    }

}
