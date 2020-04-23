package com.vivek.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class TestAir {
	public static void main(String[] args) {
	        List<String> givenList = new ArrayList<String>();
	        String str0 = "ab1 aur odm cbe oks";
	        String str1 = "mb2 12  45  43  01";
	        String str2 = "aa6 bua doo mhe peo";
	        String str3 = "a21 11  46  93  03";
	        givenList.add(str0);
	        givenList.add(str1);
	        givenList.add(str2);
	        givenList.add(str3);
	        
			Map<String, String> strMap = new HashMap<String, String>();
			Map<Integer, String> numMap = new HashMap<Integer, String>();
			
			
			for(String str : givenList){
				StringTokenizer tokenizer = new StringTokenizer(str);
				int count =1;
				int secondWordInteger;
				while(tokenizer.hasMoreTokens() ) {
					String token = tokenizer.nextToken();
					count++;
					if(count ==3) {
						try {
						secondWordInteger = Integer.parseInt(token);
						numMap.put(secondWordInteger, str);
						}catch (NumberFormatException e) {
							System.out.println("DSDSDS");
							strMap.put(token, str);
						}
						count=1;
						break;
					}
				}
			}	
			
			TreeMap<String, String> sortedStrMap = new TreeMap<String, String>();
			sortedStrMap.putAll(strMap);
		 
			TreeMap<Integer, String> sortedIntegerMap = new TreeMap<Integer, String>();
			sortedIntegerMap.putAll(numMap);
			
			List<String> list = new ArrayList<String>();
			
			for (Map.Entry<String, String> entry : sortedStrMap.entrySet()) {
				list.add(entry.getValue());
			}
			
			for (Map.Entry<Integer, String> entry : sortedIntegerMap.entrySet()) {
				list.add(entry.getValue());
			}
			
			System.out.println(list);
			
	}
}
