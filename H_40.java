	package Hunter;
	import java.util.Scanner;
	public class H_40 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the num");
		int c=sc.nextInt();
		int sum=0;
		while(c!=0){
			sum+=c%10;
			c/=10;
		}
		String empty=String.valueOf(sum);
		StringBuffer summa=new StringBuffer(empty);
		String reverse=summa.reverse().toString();
		if(empty.equals(reverse)){
			System.out.println("the sum of the given number is an palindrome");
		}
		else{
			System.out.println("the sum of the given number is not an palindrome");
		}
		}
		}
