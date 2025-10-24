package com.rc.strings;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		boolean flag = true;
		
		for(int i =0 ; i< str.length()/2; i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag = false;
				break;
			}
		}
		
		System.out.println((flag?"palindrome":"not palindrome"));
	}

}
