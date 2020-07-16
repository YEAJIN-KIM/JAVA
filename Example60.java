import java.util.Scanner;
class Example60{
	public static void main(String args[]){
		double a,b;
		String x;
		String z="";
		do{
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자와 연산자를 입력하세요.");
		System.out.print("숫자 입력1:");
		a=scan.nextDouble();
		System.out.print("숫자 입력2:");
		b=scan.nextDouble();
		System.out.print("연산자 입력:");
		x=scan.next();
			
			if(x.equals("+"))
				System.out.println((a+b));
			else if(x.equals("-"))
				System.out.println((a-b));   
			else if(x.equals("*"))
				System.out.println((a*b));      
 			else if(x.equals("/"))
				System.out.println((a/b));
      			else if(x.equals("x"))
				break;
			else 
				System.out.println((a%b)); 
				System.out.println("계속하려면 아무키나 누르십시오");
				z=scan.next();
			  } 
				while(z.equals(z));
	
	}
}