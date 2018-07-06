import java.util.Scanner;
class Shape {
	private long pvtNum=1;
	
	float height,width;

	public Shape(){
	}
	public Shape(float height){
		this.height = height;
		this.width = height;
	}
	public Shape(float height, float width){
		this.height = height;
		this.width = width;
	}
	public float getArea(){
		return (this.height * this.width);
	} 
	public float getPerimeter(){
		return (2*this.height + 2*this.width);
	}
	public boolean equals(Shape s){
		return s.getClass() == this.getClass();
	}
	public static void main(String[] args) throws NegativeValueException{
		Scanner in = new Scanner(System.in);

		Square s=new Square(0);
		Circle c=new Circle(0);
		
		System.out.println("Constructor Overloading is done to create objects of Circle and Square Using its parent class Shape");
		
		try{
			System.out.println("Enter side of a Square");
			float side = in.nextFloat();
		
			if(side<0) throw new NegativeValueException("Negative values are not accepted");
		
			s = new Square(side);
		}catch(NegativeValueException ne){
			System.out.println(ne);
		}
		System.out.println("Mehtod Overriding is done for Circle class to get Circle Perimeter and Area");	
		try{
			System.out.println("Enter radius of a Circle");
			float radius = in.nextFloat();
			
			if(radius<0) throw new NegativeValueException("Negative values are not accepted");
			
			c = new Circle(radius);
			
		}catch(NegativeValueException ne){
			System.out.println(ne);
		}
		System.out.println("Calling overrididden equals method");
		System.out.println("If objects are of same class "+c.equals(s));

		Shape sh = new Circle(3);
		System.out.println("Upward casting example\nArea of Circle with radius 3 is: "+sh.getArea());

		Shape sh1 = sh;
		Circle c1 = new Circle(0);
		if(sh1 instanceof Circle){
			c1= (Circle)sh1;
			System.out.println("Downward casting example\nArea of Circle with radius 3 is: "+sh.getArea());
		}
		Shape ss = new Shape(1,2);

		System.out.println("private number of Shape class "+ss.pvtNum);

		/*Uncomment this to observe the failing of access specifiers
			System.out.println(c1.pvtNum);
		*/
	}

}

class NegativeValueException extends Exception{
	public NegativeValueException(String msg){
		super(msg);
	}
}
