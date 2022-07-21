package sdp.prac2;

import java.util.*;

import org.checkerframework.checker.index.qual.SubstringIndexBottom;

public class SimpleFunctions {
    public SimpleFunctions() {

    }

    public List<String> task2(List<String> list) {
        for (int i = 0;i < list.size();i++){
            if (list.get(i).isEmpty()) { list.remove(i); } 
            else { 
                String item = list.get(i).substring(1,-1);
                list.set(i,item);
            }
        }   
        return list;
    }
}
