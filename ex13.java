import java.util.Scanner;
class ex13 {
	public static void main(String args[]) {
		int k[] =new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���:");
		k[0]=scan.nextInt( );
		System.out.print("���� ������ �Է��ϼ���:");
		k[1]=scan.nextInt( );
		System.out.print("���� ������ �Է��ϼ���:");
		k[2]=scan.nextInt( );
		System.out.print("���� ������ �Է��ϼ���:");
		k[3]=scan.nextInt( );
		System.out.print("�̼� ������ �Է��ϼ���:");
		k[4]=scan.nextInt( );
		System.out.println("����:"+(k[0]+k[1]+k[2]+k[3]+k[4])/1.0);
		System.out.println("���:"+(k[0]+k[1]+k[2]+k[3]+k[4])/5.0);
	}

}
