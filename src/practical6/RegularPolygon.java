package practical6;

public class RegularPolygon {
	public int n; // Number of sides
	public double length; // Length of the sides
	public double x; // x co-ord of centre
	public double y; // y co-ord of centre
	
	//Default constructor
	public RegularPolygon() {
		this(3, 1, 0, 0);
	}
	
	// Default no centre specified
	public RegularPolygon(int n, double length) {
		this(n, length, 0, 0 );
	}
	
	//Constructor
	public RegularPolygon(int n, double length, double x, double y) {
		this.n = n;
		this.length = length;
		this.x = x;
		this.y = y;
	}
	
	// Get number of sides
	public int getN() {
		return n;
	}
	
	// Get length of sides
	public double getLength() {
		return length;
	}
	
	// Get x co-ord of centre
	public double getX() {
		return x;
	}
	
	// Get y co-ord of centre
	public double getY() {
		return y;
	}
	
	// Set n
	public void setN(int n) {
		this.length = n;
	}
	
	// Set length
	public void setLength(double length) {
		this.length = length;
	}
	
	// Set x
	public void setX(double x) {
		this.x = x;
	}
	
	// Set y
	public void setY(double y) {
		this.y =y;
	}

	// Get perimeter of polygon
	public double getPerimeter() {
		return n*length;
	}
	
	//Get area of polygon
	public double getArea() {
		return (n* Math.pow(length, 2))/(4 * Math.tan(Math.PI/n));
	}
	
	public String toString() {
		return "Number of sides: " + n + "\nLength of sides: " + length +
				"\nCentre: (" + x + "," + y + ")" + "\nPerimeter: " + getPerimeter() +
				"\nArea: " + getArea();
	}
	
}
