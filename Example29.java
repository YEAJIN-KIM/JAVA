class Example29 {
	public static void main(String args[]){
		int t=10,f=20,k,b,y,s;
		k=b=30;
		y=(k==b ? t:f);
		s=(k< b ? t:f);
		System.out.println("****** result ******\n");
		System.out.println("y="+y+",s="+s);
	}
}