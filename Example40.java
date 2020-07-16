class Example40{ 
	public static void main(String arg[]) { 
		int a=1, b=2, c=0; 
		int d[][]={ {1,2,3}, {4,5}, {6,7,8,9,10} }; 
		c=d[1].length; 
		b=d.length + c++; 
		a+= ++c;
		System.out.println(a);
		System.out.println(b); 
		System.out.println(c);
}
}