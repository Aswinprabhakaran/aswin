	package Hunter;
	import java.util.Scanner;
	public class Substring_48 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string one:");
		String str=sc.next();
		System.out.println("enter the substring you want to find:");
		String str2=sc.next();
		if(str.contains(str2)){
			char ch=str2.charAt(0);
			System.out.println(str.indexOf(ch));
		}
		else{
			System.out.println(-1);
		}
		}
		}	