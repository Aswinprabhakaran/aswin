	package Hunter;
	import java.util.Scanner;
	public class H_133 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  word");
		String in1=sc.nextLine();
		String [] arr=in1.split(" ");
		int l1=arr.length;
		for(int i=l1-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		}
		}
