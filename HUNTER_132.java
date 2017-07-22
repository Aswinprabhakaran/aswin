	package Hunter;

import java.util.Scanner;
	public class HUNTER_132 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer");
		int a=sc.nextInt();
		for(int i=a;i>=0;i--){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.print(" ");
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
