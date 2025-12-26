package com.rc.strings;
import java.util.*;
public class StringDupHashMap {
	public static void main(String[] args) {
		String str = "harshithMmm";
		Map<Character , Integer > map = new HashMap<>();
		for(char c : str.toCharArray() )
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		System.out.println("Duplicate values");
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" -> "+entry.getValue());
			}
		}

	}
}

