package org.bildbosnia.stringProcesing;

import java.util.Scanner;

public class StringProcessingApp {
	
	//main
	public static void main(String[] args) {
		/*
			Napisati program koji prima od korisnika neki String te ispisuje:
			a. Duzinu Stringa
			b. Sve karaktere na parnim pozicijama
			c. Sve karaktere na neparnim pozicijama
			d. Broj UPPERCASE karaktera
			e. Broj lowercase karaktera
			f. Sve karaktere koji nisu slova
			Whitespace karaktere ne razunamo kao karaktere. Slovima smatramo sve karaktere od a-z i
			od A-Z.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s = input.nextLine();
		input.close();
		
		stringLength(s);
		evenPositionChar(s);
		oddPositionChar(s);
		numberOfUpperChar(s);
		numberOfLowerChar(s);
		allNonLetterChar(s);		
		
	}
	
	//ivana
	public static void stringLength (String s) {
		
		System.out.printf("Duzina stringa koji ste unijeli je: %d\n", s.length());
	}
	
	//ivana
	public static void evenPositionChar (String s) {
		
		System.out.println("Karakteri na neparnim pozicijama: ");
		for (int i = 0; i < s.length(); i+=2) {
			if (s.charAt(i) != ' ') {				
				System.out.print(s.charAt(i)+" ");
			}
		}
		System.out.println();
		
	}
	
	//mensur
	public static void oddPositionChar (String s) {
		System.out.println("Karakteri na parnim pozicijama: ");
		for (int i = 1; i < s.length(); i+=2) {
			if (s.charAt(i) != ' ')
				System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
	}
	
	//mensur
	public static void numberOfUpperChar (String s) {
		int brojac = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				brojac++;
		}
		System.out.println("Broj velikih slova sadrzanih u stringu: " + brojac);
	}
	
	//samir
	public static void numberOfLowerChar (String s) {
		
		 int count =0;
		
		 for(int i=0; i<s.length();i++) {
	        if(Character.isLowerCase(s.charAt(i))){
	        	count ++;
	        	}
		 }	
		 System.out.println("Broj malih slova u stringu je: " + count);
	}
	
	//samir
	public static void allNonLetterChar (String s) {
		
		String string ="";
	
		 for(int i=0; i<s.length();i++) {
		        if(!Character.isLetter(s.charAt(i))){
		        	string+=s.charAt(i);
		        	}
	            }
		 System.out.println("Modifikovani string ne sadrzi slova: " + string);
	}
}
