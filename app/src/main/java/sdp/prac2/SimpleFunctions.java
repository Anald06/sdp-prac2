package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    // task 6 begins here 
    public List<Integer> Task6(List<Integer> old_List) {
        // new list here 
        List<Integer> new_List = new ArrayList<Integer>();
    
        for(int index = 0 ; index < old_List.size(); index++)
        {
            //old_List.add(index)
             int multi = (((int)(Math.ceil(old_List.get(index))) + 99) / 100) * 100;
             //new_List.add(old_list[count]); 
             new_List.add(multi);
        }
        return new_List;
    };
    
}





