package PLAYER;
import java.util.Scanner;

public class powerof2 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		int num=input.nextInt();
		while((num !=2 && num % 2 == 0) || num ==1){
          num = num /2;
         }
		 if(num%2==0){
       	  System.out.println("It is the power of two");
         }else{
       	  System.out.println("Its is not the power of two");
         }
        
  }
}