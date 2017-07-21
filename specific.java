package Hunter;

import java.util.Scanner;

public class specific {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int c=sc.nextInt();
		int arr[]=new int[c];
		System.out.println("enter the elements ");
		for(int i=0;i<c;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the target to find");
		int f=sc.nextInt();
		for(int i=0;i<c;i++){
			for(int j=i+1;j<c;j++){
				int d=arr[i]+arr[j];
				if(d==f){
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

}
