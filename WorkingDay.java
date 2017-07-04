package PLAYER;

import java.util.Scanner;

public class WorkingDay {

	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String check=sc.next();
	switch (check){
		case "MONDAY":
			{System.out.println("true");
			break;}
		case "TUESDAY":
		{System.out.println("true");
		break;}
		case "WEDNESDAY":
		{System.out.println("true");
		break;}
		case "THURSDAY":
		{System.out.println("true");
		break;}
		case "FRIDAY":
		{System.out.println("true");
		break;}
		case "SATURDAY":
		{System.out.println("true");
		break;
		}
		default:
			System.out.println("false");
	}
	}
	}
