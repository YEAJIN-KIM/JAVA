class Animal {
	String name;
	int age;
	
	void printAnimal() {
		System.out.println("나이:"+age+"이름:"+name);
	}
}
class Cat extends Animal{
	String place; 
	void printCat(){
		printAnimal();
		System.out.println("거주지"+place);
 
	}	
}

class AnimalMain{
public static void main(String args[]) {
	Animal a=new Animal();
	a.name="고릴라";
	a.age=10;
	a.printAnimal();

	Cat c=new Cat();
	c.name="야옹이";
	c.age=5;
	c.place="정왕동";
	c.printAnimal();
	}
}