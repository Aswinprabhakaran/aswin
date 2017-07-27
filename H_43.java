	package Hunter;
	import java.util.Scanner;
	public class H_43 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.next();
		int l=str.length();
		for(int i=0;i<l;i++){
			char ch=str.charAt(i);
			 if(Character.isDigit(ch)){
				if(i+1<l){
				if(Character.isDigit(str.charAt(i+1))){
				String aa=ch+""+str.charAt(i+1);
				int a=Integer.parseInt(aa);
				for(int j=0;j<a;j++){
					if(Character.isAlphabetic(str.charAt(i-1)))
					System.out.print(str.charAt(i-1));
				}
				}
				else
				{
					int a=Character.getNumericValue(str.charAt(i));
					for(int j=0;j<a;j++){
						if(Character.isAlphabetic(str.charAt(i-1)))
						System.out.print(str.charAt(i-1));
				}
				}
				}
				else
				{
				int a=Character.getNumericValue(str.charAt(i));
				for(int j=0;j<a;j++){
					if(Character.isAlphabetic(str.charAt(i-1)))
					System.out.print(str.charAt(i-1));
				}
				}
				}
				}
				}
				}