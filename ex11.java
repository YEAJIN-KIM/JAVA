import java.util.Scanner;
class ex11 {
	public static void main(String args[]) {
		String x;
		Scanner scan=new Scanner(System.in);
		System.out.print("이름을 입력하세요.:");
		x=scan.nextLine();
		System.out.println("이름은"+x+"입니다.");
		System.out.println("계속 하려면 아무키나 누르십시오...");
	}
}		