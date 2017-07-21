package Hunter;

import java.util.Scanner;

public class notpalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		int l=str.length();
		int l2=0;
		String output="";
		StringBuffer bla=new StringBuffer(str);
		String waste=bla.reverse().toString();
		if(!(str.equals(waste))){
			System.out.println(l);
		}
		else{
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
					String dummy=str.substring(i, j+1);
					StringBuffer summa=new StringBuffer(dummy);
					String reverse=summa.reverse().toString();
					if(!(dummy.equals(reverse))){
						int l1=reverse.length();
						if(l1>l2){
						output=dummy;
						l2=l1;
						}
						}
						}
						}
						}
		System.out.println(output);
		System.out.println(output.length());
						}
						}
