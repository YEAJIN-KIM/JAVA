class Example28 {
	public static void main(String args[]){
		int x=1,y=1,z;
		z=x++;
		System.out.println("z=x++�� ����"+z);		
		System.out.println("++x�� ����"+ ++x);
		z=++y;
		System.out.println("z=++y�� ����"+z);
		System.out.println("y++�� ����"+ y++);
	}
}