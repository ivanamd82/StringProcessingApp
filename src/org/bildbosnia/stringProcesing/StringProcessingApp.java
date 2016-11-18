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
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		
	}
	
	//mensur
	public static void oddPositionChar (String s) {
		
	}
	
	//mensur
	public static void numberOfUpperChar (String s) {
		
	}
	
	//samir
	public static void numberOfLowerChar (String s) {
		
	}
	
	//samir
	public static void allNonLetterChar (String s) {
		
	}
	

}
