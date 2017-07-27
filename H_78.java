	package Hunter;
	import java.util.LinkedList;
	import java.util.Scanner;
	public class H_78 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		LinkedList<Integer> l1=new LinkedList<Integer>();
		for(int i=0;i<size;i++){
			l1.add(sc.nextInt());
			}
		System.out.println("LINKLED LIST = "+l1);
				System.out.println(" middle element of the linked list = " +l1.get(size/2));
			}
			}
