package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static String solution(String my_string, int[] indices) {
        String[] arr=my_string.split("");
        List<String> list =new ArrayList<String>();
        boolean flag;
        for(int i=0; i<arr.length;i++) {
        	flag=false;
        	for(int j=0;j<indices.length;j++) {
        		if(i==indices[j]) {
        			flag=true;
        			break;
        		}
        	}
        	if(flag==false) {
        		list.add(arr[i]);
        	}
        }
        String ans ="";
        for(int i=0; i<list.size();i++) {
        	ans+=list.get(i);
        }
        return ans;
        
    }



	 
    
	       
	
	public static void main(String[] args) {
		
		int[] sarr=  new int[]{1, 16, 6, 15, 0, 10, 11, 3};
	System.out.println(solution("apporoograpemmemprs",sarr));
	}
    
}

	


