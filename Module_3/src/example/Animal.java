package example;

public class Animal {
	
	void sound() {
		System.out.println("makes sound");
	}

	
	public static void main(String[] args) {
		Dog ob= new Dog();
		ob.bark();
		ob.sound();
		}
	}

