	package Hunter;
	import java.util.Scanner;
	import java.util.StringTokenizer;
	public class H_92 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		/*str=str.replaceAll("\\s{2,}"," ").trim();*/
	StringTokenizer ab=new StringTokenizer(str);
	while(ab.hasMoreTokens()){
	System.out.print(ab.nextToken() + " ");
		}
		}
		}