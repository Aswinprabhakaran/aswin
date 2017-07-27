	package Hunter;
	import java.util.Scanner;
	public class H_75 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entere the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(i!=size-1){
				if(arr[i]>arr[i+1]){
					System.out.print(arr[i+1]+" ");
				}
				else{
					System.out.print(-1 + " ");
				}
				}
			else{
				System.out.print(-1 + " ");
			}
			}
			}
			}