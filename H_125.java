	package Hunter;
	import java.util.Scanner;
	public class H_125 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		int l=str.length();
		for(int i=0;i<l;i++){
			for(int j=i+1;j<l;j++){
				if(str.charAt(i)==str.charAt(j)){
					String dummy=str.substring(i, j+1);
					StringBuffer summa=new StringBuffer(dummy);
					String reverse=summa.reverse().toString();
					if(dummy.equals(reverse)){
						System.out.println(dummy);	
						}
						}
						}
						}
						}
						}