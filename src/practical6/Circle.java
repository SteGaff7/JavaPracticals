package practical6;

public class Circle {
	private double radius; // The radius
	private double x; //X co-ord of centre
	private double y; //Y co-ord of centre
	private String centre; 
	private static int numberOfObjects = 0; // Number of objects created 
	
	// Construct a circle with radius 1
	public Circle() {
		this(1.0, 0.0, 0.0);
	}

	// Construct a circle with the specified radius
	public Circle(double radius, double x, double y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
		this.centre = "(" + x + "," + y + ")";
		numberOfObjects++;
	}
	
	// Return the radius
	public double getRadius() {
		return radius;
	}
	
	// Return the centre
	public String getCentre() {
		return centre;
	}
	
	// Set a new radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Set new centre point
	public void setCentre(double x, double y) {
		this.x = x;
		this.y = y;
		this.centre = "(" + x + "," + y + ")";
	}
	
	// Return the number of objects created
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	// Return the area
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	//Return the perimeter of circle
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	//Return the distance to the centre of another circle
	public double getDistance(Circle c) {
		double x1 = this.x;
		double y1 = this.y;
		double x2 = c.x;
		double y2 = c.y;
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	// Return a string representation
	public String toString() {
		return "radius = " + radius + "\ncentre = " + centre;
	}
}
