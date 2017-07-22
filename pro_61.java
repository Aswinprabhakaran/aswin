	package Hunter;
	import java.util.Scanner;
	public class pro_61 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		System.out.println("enter te first string");
		String first=sc.nextLine().toLowerCase();
		int l=first.length();
		String output1="";
		for(int i=0;i<l;i++){
			char ch=first.charAt(i);
			int c=alphabet.indexOf(ch);
			int d=c+10;
			if(d>26)
				d=Math.abs(26-d);
			else
				d=d;
			output1+=String.valueOf(alphabet.charAt(d));
		}
		System.out.println("enter the string two");
		String second =sc.next();
		int l2=second.length();
		String output2="";
		for(int i=0;i<l2;i++){
			if(i>0&&i<l2-1){
				char ch=second.charAt(i);
				int c=alphabet.indexOf(ch);
				int d=c+10;
				if(d>26)
					d=Math.abs(26-d);
				else
					d=d;
				output2+=String.valueOf(alphabet.charAt(d));
			}
				else
				output2+=second.charAt(i);
				}
		System.out.println(output1+" "+output2);
		}
		}