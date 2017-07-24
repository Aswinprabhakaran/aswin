	package Hunter;
	import java.util.Arrays;
	import java.util.Scanner;
	public class H_76 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of students:");
		int size=sc.nextInt();
		System.out.println("enter  the total number of subjects");
		int sub=sc.nextInt();
		int []avg=new int[size];
		int [] arr=new int[size];
		int [] brr=new int[sub];
		for(int i=0;i<size;i++){
			int sum=0;
			for(int j=0;j<sub;j++){
			brr[j]=sc.nextInt();
		sum+=brr[j];
		}
		System.out.println(" avg of " + i + " = " + sum/sub );
		for(int  k=i ;k<size;k++){
			avg[k]=sum/sub;
		}
		}
		Arrays.sort(avg);
		for(int l=0;l<size;l++){
			System.out.println(avg[l]);
		}
		}		
		}