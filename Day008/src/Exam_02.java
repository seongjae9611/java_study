
public class Exam_02 {
	public static void main(String[] ar) {
		int[] x = new int[] {3, 6, 3, 4, 7, 8, 4, 3,1,1,1,1,1};
		short[] y= new short[] {3,4,4,4,5,6,6,7,8,1};
		
		System.out.println("x.length = " + x.length);
		System.out.println("y.length = " + y.length);
		
//		System.out.println("x[0] = " + x[0]);
//		System.out.println("x[0] = " + x[1]);
//		System.out.println("x[0] = " + x[2]);
//		System.out.println("x[0] = " + x[3]);
//		System.out.println("x[0] = " + x[4]);
//		System.out.println("x[0] = " + x[5]);
//		System.out.println("x[0] = " + x[6]);
//		System.out.println("x[0] = " + x[7]);
		
		for(int i = 0; i < 8; ++i)
			System.out.println("x[" + i + "]  = " + x[i]);
		x = null;
	}
}
