import java.util.Scanner;
class Example45 {
	public static void main(String args[]) {
		double k[] =new double[3];
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요:");
		k[0]=scan.nextDouble( );
		System.out.print("영어 점수를 입력하세요:");
		k[1]=scan.nextDouble( );
		System.out.print("수학 점수를 입력하세요:");
		k[2]=scan.nextDouble( );
		System.out.println("평균:"+(k[0]+k[1]+k[2])/3.0);
	}

}