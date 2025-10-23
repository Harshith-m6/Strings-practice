package com.rc.strings;

import java.util.Scanner;

public class StringVowelCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		int vowels =0 ;
		int conso =0;
		s.toLowerCase();
		
		for(int i =0 ; i<s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				if("aeiou".indexOf(ch)!=-1)
					vowels++;
				else
					conso ++;
			}
		}
		System.out.println("numer of vowels :"+vowels);
		System.out.println("number of consonants :"+conso);
	}

}
