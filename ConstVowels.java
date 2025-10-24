package com.rc.strings;

import java.util.Scanner;

public class ConstVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		str =str.toLowerCase();
		
		int vcount = 0;
		int ccount = 0;
		for(int i =0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				if(ch=='a'|| ch=='e' || ch=='i' || ch =='o' || ch=='u')
				{
					vcount++;
				}else 
					ccount++;
			}
		}
		System.out.println("number of vowels "+vcount);
		System.out.println("number of consonants "+ccount);
		
	}

}
