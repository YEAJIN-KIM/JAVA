import java.util.Scanner;
class ex13 {
	public static void main(String args[]) {
		int k[] =new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요:");
		k[0]=scan.nextInt( );
		System.out.print("영어 점수를 입력하세요:");
		k[1]=scan.nextInt( );
		System.out.print("수학 점수를 입력하세요:");
		k[2]=scan.nextInt( );
		System.out.print("과학 점수를 입력하세요:");
		k[3]=scan.nextInt( );
		System.out.print("미술 점수를 입력하세요:");
		k[4]=scan.nextInt( );
		System.out.println("총점:"+(k[0]+k[1]+k[2]+k[3]+k[4])/1.0);
		System.out.println("평균:"+(k[0]+k[1]+k[2]+k[3]+k[4])/5.0);
	}

}
