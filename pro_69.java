			package Hunter;
			import java.util.Scanner;
			public class pro_69 {
			public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String name=sc.next();
		int max=0,min=0;
		String a="";
		int l=name.length();
		for(int i=0;i<l;i++){
			if(Character.isDigit(name.charAt(i))){
				a+=name.charAt(i);
				if(Integer.parseInt(String.valueOf(name.charAt(i)))>max){
					max=Integer.parseInt(String.valueOf(name.charAt(i)));
					}
					}
					}
		int aa=Integer.parseInt(a);
		int bb=aa;
		int sum=0;
		while(aa!=0){
			sum+=(aa%10)*max;
			aa=aa/10;
		}
		int sum1=0;
		while(sum>9){
			sum1=0;
			while(sum!=0){
				sum1+=sum%10;
				sum/=10;
			}
			sum=sum1;
		}
		System.out.println("Step1-sum1 = "+sum1);
		//step-2
		for(int i=0;i<l;i++){
			if(Character.isDigit(name.charAt(i))){
				min=max;
				if(Integer.parseInt(String.valueOf(name.charAt(i)))<min){
					min=Integer.parseInt(String.valueOf(name.charAt(i)));
					}
					}
			max=min;
					}
		int sum3=1,sum2=0;
		while(bb!=0){
			sum3*=(bb%10)+min;
			bb/=10;
		}
		while(sum3>9){
			sum2=0;
			while(sum3!=0){
				sum2+=sum3%10;
				sum3/=10;
			}
			sum3=sum2;
		}
		System.out.println("step2-sum2 = "+sum2);
		//step-3;
		int digit=Math.min(sum1, sum2);
		System.out.println("min of two = "+digit);
		int output=digit*digit;
		System.out.println("output = "+output);
					}
					}