class Animal {
	String name;
	int age;
	
	void printAnimal() {
		System.out.println("����:"+age+"�̸�:"+name);
	}
}
class Cat extends Animal{
	String place; 
	void printCat(){
		printAnimal();
		System.out.println("������"+place);
 
	}	
}

class AnimalMain{
public static void main(String args[]) {
	Animal a=new Animal();
	a.name="����";
	a.age=10;
	a.printAnimal();

	Cat c=new Cat();
	c.name="�߿���";
	c.age=5;
	c.place="���յ�";
	c.printAnimal();
	}
}