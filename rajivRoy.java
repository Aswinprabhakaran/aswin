		import java.util.Scanner;
		public class rajivRoy {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first name:");
		String firstname=sc.next();
		System.out.println("enter the last name:");
		String lastname=sc.next();
		System.out.println("enter the pin:");
		String pin=sc.next();
		System.out.println("enter the position:");
		int c=sc.nextInt();
		int l=firstname.length();
		int l1=lastname.length();
		String output="";
		if(l>l1){
			output+=firstname.charAt(0)+""+lastname+""+pin.charAt(c-1)+pin.charAt(pin.length()-c);
				}
		else if(l<l1){
			output+=lastname.charAt(0)+firstname+pin.charAt(c-1)+pin.charAt(pin.length()-c);
		}
		else{
			for(int i=0;i<l;i++){
			int ch=Character.getNumericValue(firstname.charAt(i));
			int dh=Character.getNumericValue(lastname.charAt(i));
			if(ch>dh){
				output+=firstname.charAt(0)+""+lastname+""+pin.charAt(c-1)+pin.charAt(pin.length()-c);
					break;
			}
			if (dh>ch){
				output+=lastname.charAt(0)+firstname+pin.charAt(c-1)+pin.charAt(pin.length()-c);
				break;
			}
			}
			}
		System.out.println("output = "+output);
		String output1="";
		for(int i=0;i<output.length();i++){
			if(Character.isAlphabetic(output.charAt(i))){
				if(Character.isUpperCase(output.charAt(i))){
					output1+=Character.toLowerCase(output.charAt(i)); 	
				}
				else{
					output1+=Character.toUpperCase(output.charAt(i));
				}
				}
			else{
				output1+=output.charAt(i);
			}
			}
		System.out.println("toogled output = "+output1);	
		}
		}