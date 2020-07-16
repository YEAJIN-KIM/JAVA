class Circle {
	int radius;
	Circle (){
	}
	Circle (int x) {
		setRadius(x);
	}
	void setRadius(int x) {
		radius=x;
		System.out.println("넓이"+getArea());
		System.out.println("길이"+getLength());

	}
	int getRadius() {
		return radius;
	}
	double getArea(){
		return 3.14*radius*radius;
	}
	double getArea(int x){
		return 3.14*x*x;
	}
	double getLength(){
		return 3.14*2*radius;
	}
}

class CircleMain{
	public static void main(String args[]){
		Circle c1=new Circle();
		c1.setRadius(4);

		System.out.println(c1.getArea());
		System.out.println(c1.getArea(10)); //반지름이 10인 원의 넓이 구해준당


		Circle c2=new Circle(5);
		System.out.println(c2.getLength());
	}
}