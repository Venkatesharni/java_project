package geomatricArea;
import java.lang.Math;//to use math operations like Square root if require
/**
 * This project tells about the functionality to Calculate the Area for Different Geometric 
 * Dimensions for Mathematics Project.
 */

public class GeometricArea {
	
	//main class
	public static void main(String[] args) {
		System.out.print("Given 2-Dimensional geometric figures-------");
		String name2d = "Square ,Circle,Rectangle,Trinagle";//giving input names of  2-dimensional geometric figures 
		System.out.println(name2d);
		
		//creating a object instance for both 2-dimensional & 3-dimensional
		Area2D obj1 = new Area2D();
		Area3D obj2 = new Area3D();
		obj1.SquareArea(25);// calling the SquareArea method
		obj1.CircleArea(14);// calling the CircleArea method
		obj1.Rect(10,20);// calling the Rect method
		obj1.TriArea(10,12);// calling the TriArea method
		System.out.println("..................................");
		
		System.out.print("Given 3-Dimensional geometric figures-------");
		String name3d = "Cube ,Sphere, Box(Cuboid) ,Cone";//giving input names of  3-dimensional geometric figures
		System.out.println(name3d);
		obj2.CubeArea(5);// calling the 
		obj2.SphereArea(7);// calling the SphereArea method
		obj2.Box(8, 6, 4);
		obj2.Conearea(12, 22);
		
		
		
	}
        
}
class Area2D extends GeometricArea{
	// Child class created  for 2-Dimensional object
	void SquareArea(float x){
		// create method to calculate Square Area
		float areaS= x*x ;// x is lenth of side of the Square
		System.out.println("The area of the Square is "+areaS+ "sq.units" );
		
	}
	void CircleArea(long r){
		// create method to calculate Circle Area
		double p = 3.14;
		double areaC= p*r*r ;//here r is the radius of circle
		System.out.println("The area of the Circle is "+areaC+ "sq.units" );
		
	}
	void Rect(float l,float w){
		// create method to calculate Rectangle Area
		float areaR= l*w ;// here l is the length  of rectangle where w is the width 0f Rectangle
		System.out.println("The area of the Rectangle is "+areaR+ "sq.units" );
		
	}
	void TriArea(float h,float b){
		// create method to calculate Triangle Area
		double areaT = (0.5d)*b*h ;// here h is the height  of rectangle where b is the base of triangle
		System.out.println("The area of the Triangle area is " +areaT+ "sq.units" );
		
	}
}
class Area3D extends GeometricArea{
	// Child class created for 3-dimensional objects
	void CubeArea(float x){
		// create method to calculate Cube Area
		float areaCb= x*x*x ;// x is length of side of the Cube
		System.out.println("The area of the Cube is "+areaCb+ "sq.units" );
		
	}
	void SphereArea(long r){
		// create method to calculate Sphere Area
		double p = 3.14;
		double areaSp= 4*p*r*r ;//here r is the radius of Sphere
		System.out.println("The area of the Sphere is "+areaSp+ "sq.units" );
		
	}
	void Box(float l,float w,float hi){
		// create method to calculate Box Area
		float areaB= 2*(l*w + w*hi +hi*l);// here l is the length  of Box where w is the width 0f Box and hi is height of Box
		System.out.println("The area of the Box(cuboid) is "+areaB+ "sq.units" );
		
	}
	void Conearea(float r,float h){
		// create method for Cone Area
        double areaCo =3.14f*r*r+3.14f*r*(Math.sqrt(r*r+h*h));//Here r radius of cone and h height of cone
        System.out.println("The area of the Cone is "+areaCo+ "sq.units" );
       }
	
}
		
	
