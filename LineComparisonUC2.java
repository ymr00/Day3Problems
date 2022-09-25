
import java.util.Scanner;

public class LineComparisonUC2  {
	
	
	public LineComparisonUC2() {
		
		getLineCordinate();
	}
public static void main(String[] args) {
	System.out.println("Welcome to Line Comparison Computation");
	
	LineComparisonUC2 obj1 = new LineComparisonUC2();	
}
public static void getLineCordinate() {
	System.out.println("To  a line ");
	Scanner sc = new Scanner(System.in);
	int[] lineLengthArray =new int[2];
	for (int i=1; i<=2; i++) {
		//System.out.println("enter the start and end  cordinate of Line l1: ");
		System.out.println("enter the start and end  cordinate of Line L" + i + " :");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println("line L" + i +" start cordinates (x1 ,y1 ) = ( " + x1 + "," + y1 + " )" );
		System.out.println("line L" + i + "  end cordinate (x2 ,y2) = ( " + x2 + "," + y2 + " )" );
		
		  int lineLength = calculateLineLength(x1,y1,x2,y2);
		  lineLengthArray[i-1] = lineLength;
		System.out.println(" length of line: " + lineLength);
		
	}
			if (lineLengthArray[0]==lineLengthArray[1]) {
				System.out.println("Line L1 and L2 are equal");
			}
			else
				System.out.println("Line L1 and L2 are not equal");

	}
	public static int calculateLineLength(int x1,int y1, int x2, int y2) {
	
	 int length = (int) Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1),2)) );
	return length;
}
}


