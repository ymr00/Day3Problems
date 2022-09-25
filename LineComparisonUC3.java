import java.util.Scanner;

public class LineComparisonUC3 {
	
	

	public LineComparisonUC3() {

		getLineCordinate();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation");

		LineComparisonUC3 obj1 = new LineComparisonUC3();
	}

	public static void getLineCordinate() {
//		Integer lengthL1 = null, lengthL2 = null;
		Scanner scanobj = new Scanner(System.in);
		int[] lineLengthArray = new int[2];
		for (int i = 1; i <= 2; i++) {
			// System.out.println("enter the start and end cordinate of Line l1: ");
			System.out.println("enter the start and end  cordinate of Line L" + i + " :");
			int x1 = scanobj.nextInt();
			int y1 = scanobj.nextInt();
			int x2 = scanobj.nextInt();
			int y2 = scanobj.nextInt();
			System.out.println("line L" + i + " start cordinates (x1 ,y1 ) = ( " + x1 + "," + y1 + " )");
			System.out.println("line L" + i + "  end cordinate (x2 ,y2) = ( " + x2 + "," + y2 + " )");

			int lineLength = calculateLineLength(x1, y1, x2, y2);
			lineLengthArray[i - 1] = lineLength;
			System.out.println(" length of line: " + lineLength);
//			lengthL1 = new Integer("lineLengthArray[0]");
//			lengthL2 = new Integer("lineLengthArray[1]");
		}
//		int res = lengthL1.compareTo(lengthL2);
//		if(res > 0) {
//			System.out.println("Line L1 is greater than L2 ");
//	      } else if(res < 0) {
//	    	  System.out.println("Line L1 is less than L2 ");
//	      } else {
//	    	  System.out.println("Line L1 and L2 are equal");
//	      }
		if (lineLengthArray[0] == lineLengthArray[1]) {
			System.out.println("Line L1 and L2 are equal");
		} else if (lineLengthArray[0] > lineLengthArray[1]) {
			System.out.println("Line L1 is greater than L2 ");
		} else
			System.out.println("Line L1 is less than L2 ");

	}

	public static int calculateLineLength(int x1, int y1, int x2, int y2) {

		int length = (int) Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		return length;
	}
}
