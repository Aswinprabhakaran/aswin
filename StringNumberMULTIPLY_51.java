	package Hunter;
	import java.util.Scanner;
	public class StringNumberMULTIPLY_51 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		String str1=sc.next();
		System.out.println("enter the second number:");
		String str2=sc.next();
		long num1=Long.parseLong(str1);
		long num2=Long.parseLong(str2);
		long out=num1*num2;
		String output="";
		output+=out;
		System.out.println(output);
		}
		}
