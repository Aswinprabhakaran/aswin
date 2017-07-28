	package Hunter;
	import java.util.Scanner;	
	public class H_53 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		int l=str.length();
		System.out.println("enter the input length:");
		int c=sc.nextInt();
		for(int i=0;i<l-1;i++){
		System.out.println(str.substring(0,c-1)+str.substring(i+1,i+2));
		//System.out.println(str.substring(0,c-1)+str.charAt(i+1); 
		}
		}
		}