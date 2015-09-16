public class Triangle {

	public static void main(String[] args) {
		double A,a,B,b,C,c,x1,y1,x2,y2,x3,y3 = 0;
		
		x1 = 1;y1 = 1;
		x2 = 3;y2 = 4;
		x3 = 5;y3 = 3;
		
		a = Math.sqrt(Math.pow((x3 - x2),2) + Math.pow((y3-y2),2));
		b = Math.sqrt(Math.pow((x3 - x1),2) + Math.pow((y3-y1),2));
		c = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2-y1),2));
		
		A = Math.acos((a*a - b*b - c*c) / (-2 * b * c));
		B = Math.acos((b*b - a*a - c*c) / (-2 * a * c));
		C = Math.acos((c*c - b*b - a*a) / (-2 * a * b));
		
		System.out.println("A = ("+A+")=> to Degree ="+Math.toDegrees(A));
		System.out.println("B = ("+B+")=> to Degree ="+Math.toDegrees(B));
		System.out.println("C = ("+C+")=> to Degree ="+Math.toDegrees(C));
		System.out.printf("Total A+B+C =%.2f\n",(Math.toDegrees(A)+Math.toDegrees(B)+Math.toDegrees(C)));
	
	}

}
