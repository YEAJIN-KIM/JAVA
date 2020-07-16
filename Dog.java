class Dog {
	String name;	
	int age;
	String variety;
	Dog(String n, int a,String v){
		name=n;
		age=a;
		variety=v;
	}
	void printDog() {
		System.out.println("이름은"+name+"나이는"+age);
	}
	int getAge(){
		return age;
	}
	void setName(String n){
		name=n;
	}
	int getAddAge(){
		++age;
		return age;
	}
}
			

		
	

		
	