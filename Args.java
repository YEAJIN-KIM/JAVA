class Args {
	public static void main(String args[]){
		String x=args[0];
		for(int i=x.length()-1;i>=0;i--){
			System.out.print(x.charAt(i));
		}
	}
}