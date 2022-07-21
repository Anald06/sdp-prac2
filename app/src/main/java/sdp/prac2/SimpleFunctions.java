package sdp.prac2;

import java.util.*;

import org.checkerframework.checker.index.qual.SubstringIndexBottom;

public class SimpleFunctions {

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
    
        static boolean Task3(String str) {
            int left = 0;
            int right = 0;
            char[] chars = str.toCharArray();
            for(int i =0 ;i<chars.length;i++){
                if(chars[i]=='('){
                    left++;
                }
                else if(chars[i]==')'){
                    right++;
                }
                
            }
            return left==right;
        }

        public static List<Integer> task4(List<Integer> a, List<Integer> b) { //Task 4 - G20C0846
        	List<Integer> newList = new ArrayList<Integer>(); //newList which is a mix of the previous 2
            	if (a.size() != b.size()) { //if the 2 lists are not the same size, return null
                	return null;
            	}
            	for (int i = 0; i < a.size(); i++) { //run for length of list
                	int element = a.get(i) * b.get(b.size() - 1 - i); //multiply first element of list a to last element of list b, then 2cnd of a to 2cnd last of b and repeat 
                	newList.add(element); //add each newly created element to newList
            	}
            	return newList;
        }

}

