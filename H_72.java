	package Hunter;
	import java.util.Scanner;
	public class H_72 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		int l=arr.length;
		String out="";
		for(int i=0;i<l;i++){
			int c=i+1;
			if(c%2!=0){
				String dummy=arr[i].toString();
				StringBuffer summa=new StringBuffer(dummy);
				String reverse=summa.reverse().toString();
				out+=reverse+" ";
					}
			else	{
				out+=arr[i]+" ";
					}
					}
	System.out.println(out);
					}
					}
