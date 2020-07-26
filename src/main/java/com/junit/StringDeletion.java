package com.junit;
public class StringDeletion{
	public String deletechar(String string) {
		char characters_of_string[]=string.toCharArray();
		int length_of_string=characters_of_string.length;
		switch(length_of_string) {
		case 0: break;
		case 1: if(characters_of_string[0]=='A')
					characters_of_string[0]=' ';
				break;
		default:
			if(characters_of_string[0]=='A')
				characters_of_string[0]=' ';
			if(characters_of_string[0]!='A' && characters_of_string[1]=='A') {
				characters_of_string[1]=characters_of_string[0];
				characters_of_string[0]=' ';
			}
			break;
		}
		return new String(characters_of_string).trim();
		
	}
}