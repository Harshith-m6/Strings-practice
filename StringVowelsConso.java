package com.rc.strings;

public class StringVowelsConso {
	public static void main(String[] args) {
		String s= "madam";
		s.toLowerCase();
		int vcount =0;
		int ccount =0;
		for(int i =0 ; i<s.length(); i++)
		{
	
			char a = s.charAt(i);
			if(a>='a' && a<='z')
			{
				if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
				{
					vcount++;
				}else {
					ccount++;
				}
			}
			
		
		}
		System.out.println("vowels "+vcount+"  "+"consonants"+ccount);
		
		
	}

}
