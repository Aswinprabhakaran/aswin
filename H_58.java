	package Hunter;
	import java.util.Scanner;
	public class H_58 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the "+ size +" array  elements one by one");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the difference:");
		int c=sc.nextInt();
		int count=0;
		for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			int e=Math.max(arr[i], arr[j]);
			int f=Math.min(arr[i], arr[j]);
			if((e-f)==c){
				count++;
				System.out.println(arr[i]+","+arr[j]);
				}
				}
				arr[i]='\0';
				}
		System.out.println(" Total pairs count = "+count);
				}	
				}