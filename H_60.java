	package Hunter;
	import java.util.Scanner;
	public class H_60 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int Size=sc.nextInt();
		int arr[]=new int[Size];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int brr[]=new int[Size];
		System.out.println("enter the rotated array:");
		for (int i = 0; i < brr.length; i++) {
		brr[i]=sc.nextInt();
		}
		int c=brr[0];
		for (int i = 0; i < Size; i++) {
		if(arr[i]==c){
		System.out.println(" the array has been rotated "+ i +" times");
		}
		}		
		}
		}