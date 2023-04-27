

public class Rectangle {
	double length    ;
	double breadth   ;
	double hight;
	public Rectangle(double length, double breadth) {
		this.length = length ;
		this.breadth = breadth;
		
		
	}
	void display() {
		System.out.println("length : "+length);
		System.out.println("breadth :"+breadth);
		
		}
	public void area() {
		double a= length*breadth;
		System.out.println(a);
		
	
	}
	public static void main(String[] args) {
	 Rectangle ob=new Rectangle(5,5);
	 ob.area();
		
		

	}

}
