import java.util.Scanner;
class Example44{
	public static void main(String args[]){
	Scanner scan =new Scanner(System.in);
	System.out.println("2의 정수는 다음과 같다:");
	
	int a,b;
	a=scan.nextint();
	b=scan.nextint();
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("2개 정수의 사칙연산 결과는 다음과 같다.");
	System.out.println("a+b="+(a+b));
	System.out.println("a-b="+(a-b));
	System.out.println("a*b="+(a*b));
	System.out.println("a/b="+(a/b));
	
}
}