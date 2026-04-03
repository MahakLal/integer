package number;
class Dog{
	String name;
	String colour;
	int cost;
	void bark() {
		System.out.println("Barking");
	}
	void sleep() {
		System.out.println("Sleeping");
	}
	void eat() {
		System.out.println("Eating");
	}
	
}
public class Main19 {

	public static void main(String[] args) {
		Dog d1=new Dog();
		System.out.println(d1.name);
		System.out.println(d1.colour);
		System.out.println(d1.cost);
		Dog d2=new Dog();
		d2.bark();
		d2.sleep();
		d2.eat();
	}

}
