import java.util.Scanner;
class Example60{
	public static void main(String args[]){
		double a,b;
		String x;
		String z="";
		do{
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڿ� �����ڸ� �Է��ϼ���.");
		System.out.print("���� �Է�1:");
		a=scan.nextDouble();
		System.out.print("���� �Է�2:");
		b=scan.nextDouble();
		System.out.print("������ �Է�:");
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
				System.out.println("����Ϸ��� �ƹ�Ű�� �����ʽÿ�");
				z=scan.next();
			  } 
				while(z.equals(z));
	
	}
}