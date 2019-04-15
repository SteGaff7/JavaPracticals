package practical8;

public class Test2 {
	public static void main(String[] args) {
		Circle c = new Circle(12);
		Rectangle r = new Rectangle(10,40);
		System.out.println(c.compareTo(r));
		System.out.println(c.getArea());
		c.scale(10);
		System.out.println(c.getArea());
		System.out.println(r.getArea());
		r.scale(10);
		System.out.println(r.getArea());
	}

}
