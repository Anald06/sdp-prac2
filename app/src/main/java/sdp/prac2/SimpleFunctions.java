package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
        
        public int Task1(List<Integer> a, List<Integer> b){
            int sum_a = 0 ;
            for (int i:b){
                if (i < a.size()){
                    sum_a += a.get(i);
                }
            }
            return sum_a;
        }
    }
}
