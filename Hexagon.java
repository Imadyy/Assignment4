import java.util.Scanner; 
public class Hexagon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the sides of the hexagon: ");
		double sides = input.nextDouble();
		
		// write the formula  now for a hexagon
		 
		double Area =(6 *(sides*sides)/(4*Math.tan(Math.PI/6)));
		
		System.out.println("The area of the hexagon is " + Area);		
	}

}
