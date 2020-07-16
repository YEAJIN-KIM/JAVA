class Example41{
public static void main(String[] args) { 
	char a='H', b='L'; 
	int x=6, y=5; 
	System.out.println(x > y ? a: b); 
	System.out.println(x == y ? a: b); 
	System.out.println(x == y++ ? a: b); 
	System.out.println(x == y ? a: b); 
	System.out.println(x-- == y ? a: b); 
	System.out.println(x == y ? a: b); 
	System.out.println(x-- < y ? a: b); 
	System.out.println(x == y ? a: b);
  } 
} 