import java.util.Scanner;
class Example43{
	public static void main(String args[]){
		int a[]=new int[1];
		Scanner scan=new Scanner(System.in);
		a[0]=scan.nextInt();
		System.out.println(a[0]/3600+"�ð�"+(a[0]%3600)/60+"��"+(a[0]%3600)%60+"��");
}
}