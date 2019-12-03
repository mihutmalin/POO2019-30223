
public class TestLongMatrix {
	
 public static void main(String[] args) {
	 
	 Long[][] m1 = new Long[][]{{(long) 1, (long) 2, (long) 3}, {(long) 4, (long) 5, (long) 6}, {(long) 1, (long) 1, (long) 1}};
	 Long[][] m2 = new Long[][]{{(long) 1, (long) 1, (long) 1}, {(long) 2, (long) 2, (long) 2}, {(long) 0, (long) 0, (long) 0}};
	 
	 LongMatrix longMatrix = new LongMatrix();
	 
	 System.out.println("\nm1 + m2 is ");
	 GenericMatrix.printResult(m1, m2, longMatrix.addMatrix(m1, m2), '+');
	 
	 System.out.println("\nm1 * m2 is ");
	 GenericMatrix.printResult(m1, m2, longMatrix.multiplyMatrix(m1, m2), '*');
 }
}