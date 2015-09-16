public class Triangle {

	public static void main(String[] args) {
		double A,a,B,b,C,c = 0;
		
		a = Math.sqrt(Math.pow((4 - 3),2) + Math.pow((2-4),2));
		b = Math.sqrt(Math.pow((4 - 1),2) + Math.pow((2-1),2));
		c = Math.sqrt(Math.pow((3 - 1),2) + Math.pow((4-1),2));
		
		A = Math.acos((a*a - b*b - c*c) / (-2 * b * c));
		B = Math.acos((b*b - a*a - c*c) / (-2 * a * c));
		C = Math.acos((c*c - b*b - a*a) / (-2 * a * b));
		
		System.out.println("A = "+Math.toDegrees(A));
		System.out.println("B = "+Math.toDegrees(B));
		System.out.println("C = "+Math.toDegrees(C));
		System.out.printf("Total A+B+C =%.2f\n",(Math.toDegrees(A)+Math.toDegrees(B)+Math.toDegrees(C)));
	
	}

}
