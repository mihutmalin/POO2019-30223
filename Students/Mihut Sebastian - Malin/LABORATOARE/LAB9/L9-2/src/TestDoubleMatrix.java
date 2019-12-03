
public class TestDoubleMatrix {
 public static void main(String[] args) {
	 Double[][] m1 = new Double[][]{{1.0, 2.3, 3.90}, {4.0, 5.0, 6.0}, {1.4, 1.5, 1.0}};
	 Double[][] m2 = new Double[][]{{1.5, 1.11, 1.45}, {2.0, 2.0, 2.2}, {0.0, 0.6, 0.0}};
	 
	 DoubleMatrix doubleMatrix = new DoubleMatrix();
	 
	 System.out.println("\nm1 + m2 is ");
	 GenericMatrix.printResult(m1, m2, doubleMatrix.addMatrix(m1, m2), '+');
	 
	 System.out.println("\nm1 * m2 is ");
	 GenericMatrix.printResult(m1, m2, doubleMatrix.multiplyMatrix(m1, m2), '*');
 }
}