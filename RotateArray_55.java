	package Hunter;
	import java.util.Scanner;
	public class RotateArray_55 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			}
		System.out.println("enter the times you want to rotate:");
		int c=sc.nextInt();
		int[] temp=new int[c];
		for(int i=0;i<c;i++){
			temp[i]=arr[i];
			}
		int j=0;
		for(int i=0;i<size;i++){
			if(i<=temp.length)
				{
				arr[i]=arr[i+c];
				}
			else
				{
				arr[i]=temp[j];
				j++;
				}
				}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			}
			}
			}
