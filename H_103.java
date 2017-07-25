package Hunter;
import java.util.Scanner;
public class H_103 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num:");
		int c=sc.nextInt();
		int sum=0;
		int d=4;
				while(c!=0){
				int pow=c%10;
				int f=1;
				for(int i=0;i<d;i++ ){
				f=f*pow;
				}
				sum+=f;
				c=c/10;	
			}
			System.out.println(sum);
			}
			}
			