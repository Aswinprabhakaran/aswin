package Hunter;
import java.util.Scanner;
public class H_102 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num :");
		int c=sc.nextInt();
		int sum=0;
		while(c!=0){
			int num=c;
			while(num!=0){
			sum+=num%10;
			num/=10;
			}
			c=c/10;	
			}
		System.out.println(sum);
			}
			}