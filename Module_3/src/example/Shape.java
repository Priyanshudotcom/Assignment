package example;

public class Shape {
	
	void polygon() {
		System.out.println("It is a shape");
	}
public static void main(String[] args) {
	
	Shape sh=new Shape();
	sh.polygon();
	
	Rectangle rec = new Rectangle();
	rec.polygon();
	
	Circle cir= new Circle();
	cir.polygon();
}
}
