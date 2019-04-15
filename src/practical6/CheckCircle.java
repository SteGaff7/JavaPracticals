package practical6;

public class CheckCircle {
	public static void main(String[] args) {
		Circle circle = new Circle(5, 2, -1);
		System.out.println(circle.toString());
		//System.out.println(circle.getRadius());
		//System.out.println(circle.getCentre());
		
		System.out.println();
		
		circle.setCentre(3, 4);
		circle.setRadius(10);
		//System.out.println(circle.getPerimeter());
		//System.out.println(circle.getCentre());
		System.out.println(circle.toString());
		
		System.out.println();
		
		Circle circle2 = new Circle();
		System.out.println(circle2.toString());
		
		System.out.println("\nDistance between circles is " + circle.getDistance(circle2));
		
		System.out.println();
		System.out.println("Number of objects is " + Circle.getNumberOfObjects());
	}

}
