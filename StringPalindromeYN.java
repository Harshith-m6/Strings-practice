package com.rc.strings;

import java.util.Scanner;

public class StringPalindromeYN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();
		StringBuilder s = new StringBuilder(str);
		s.reverse();
		if(str.equalsIgnoreCase(s.toString()))
		{
			System.out.println("its a palindrome");
		}else
		{
			System.out.println("not a palindrome");
		}
		
		
	}

}
