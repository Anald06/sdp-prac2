package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
   
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
}

