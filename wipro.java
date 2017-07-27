package practise;

import java.util.Scanner;

public class wipro {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ");
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		int l1=arr.length;
		String  dummy="";
		String brr="";
		for(int i=0;i<l1;i++)
		{
		StringBuffer buffer=new StringBuffer(arr[i]);
		String reverse=buffer.reverse().toString().toLowerCase();
		int l2=reverse.length();
		for(int j=0;j<l2;j++){
		if(Character.isUpperCase(arr[i].charAt(j))){
		reverse=reverse.replace(reverse.charAt(j),Character.toUpperCase(reverse.charAt(j)));
		
		}
		}brr+=reverse+" ";
		}
		System.out.println(brr);
		}
		}
		
