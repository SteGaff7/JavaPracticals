package practical6;

public class CheckPolygon {
	public static void main(String[] args) {
		
		RegularPolygon[] polygonArray = new RegularPolygon[5];
		
		RegularPolygon p1 = new RegularPolygon(3,10.0,2.5,8.0);
		System.out.println(p1.toString());
		polygonArray[0] = p1;
		
		System.out.println();
		RegularPolygon p2 = new RegularPolygon(6,10.0);
		System.out.println(p2.toString());
		polygonArray[1] = p2;
		
		System.out.println();
		RegularPolygon p3 = new RegularPolygon();
		System.out.println(p3.toString());
		polygonArray[2] = p3;
		
		System.out.println();
		RegularPolygon p4 = new RegularPolygon(10, 5.0);
		System.out.println(p4.toString());
		polygonArray[3] = p4;
		
		System.out.println();
		RegularPolygon p5 = new RegularPolygon(4, 6.0, 3.0, 6.8);
		System.out.println(p5.toString());
		polygonArray[4] = p5;
		
		RegularPolygon smallestPerimeter = p1;
		RegularPolygon largestArea = p1;
		for (RegularPolygon x : polygonArray) {
			if (x.getPerimeter() < smallestPerimeter.getPerimeter()) {
				smallestPerimeter = x;
			}
			if (x.getArea() > largestArea.getArea()) {
				largestArea = x;
			}
		}
		System.out.println();
		System.out.println("Smallest perimeter is " + smallestPerimeter.getPerimeter());
		System.out.println("Largest area is " + largestArea.getArea());
	}

}
