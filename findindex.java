package Hunter;

import java.util.Scanner;

public class findindex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
	int arr[]=new int[size];
		System.out.println("enter the array elements");
	int count=0;
		for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
		if(arr[i]==i){
	count++;
			System.out.println("the number "+arr[i]+" equals its index  "+i);
		}
	}
		if(count==0){
			System.out.println("none matched the index");
		}
	}

}
