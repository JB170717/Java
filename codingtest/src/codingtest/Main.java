package codingtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {		
		public static void main(String[] args) {
		
			String str="Programmers";
			Map<Character, Integer> map =new HashMap<Character, Integer>();
			for(char a='A';a<='z';a++) {
				map.put(a, 0);
			}
			char[] arr=str.toCharArray();
			for(Character x:arr) {
				map.put(x, map.getOrDefault(x, 0)+1);
			}
			Set<E>=map.keySet()
		}
	}



    	
    
    
    


	
		
		
	

	
	
	
	
