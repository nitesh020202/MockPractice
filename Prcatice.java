package com.thread;
import java.util.*;
public class Prcatice {
	// Write a Java function that takes a string and a character as input and 
	// counts the number of occurrences of that character in the string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the instance of Scanner class which is available in java.util.Scanner;
		Scanner sc = new Scanner(System.in);
		String s = "Inheritance";
//		Taking the character from user
		char c = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				count++;
			}
		}
		System.out.print(count);

	}

}
