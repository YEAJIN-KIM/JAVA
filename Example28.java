class Example28 {
	public static void main(String args[]){
		int x=1,y=1,z;
		z=x++;
		System.out.println("z=x++의 값은"+z);		
		System.out.println("++x의 값은"+ ++x);
		z=++y;
		System.out.println("z=++y의 값은"+z);
		System.out.println("y++의 값은"+ y++);
	}
}