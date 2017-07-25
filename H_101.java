	package Hunter;
	import java.util.Scanner;
	public class H_101 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thr integer:");
    	int c=sc.nextInt();
            for(int i=1;i<=c;i++)
            {
            	for(int j=c;j>=i;j--)
            		System.out.print(" ");
            	for(int k=1;k<=i;k++)
            	{
            		System.out.print("*"+" ");
            	}
            	System.out.println();
            }
    		}
			}