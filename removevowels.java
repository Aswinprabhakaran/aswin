package PLAYER;

import java.util.Scanner;

public class removevowels {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to be reversed:");
		StringBuffer str=new StringBuffer(sc.next());
		String reverse=str.reverse().toString();
		System.out.println(reverse.replaceAll("[aeiouAEIOU]",""));
	}

}
