import java.util.Scanner;
class Example45 {
	public static void main(String args[]) {
		double k[] =new double[3];
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���:");
		k[0]=scan.nextDouble( );
		System.out.print("���� ������ �Է��ϼ���:");
		k[1]=scan.nextDouble( );
		System.out.print("���� ������ �Է��ϼ���:");
		k[2]=scan.nextDouble( );
		System.out.println("���:"+(k[0]+k[1]+k[2])/3.0);
	}

}