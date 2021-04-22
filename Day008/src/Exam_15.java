
public class Exam_15 {
	public static void main(String[] ar) {
//		int[] [] a = new int [3] [2];
//		int [][] a = new int[][] {{1,2,3}, {4,5}};
		int[][] a = new int[3][];
		a[0] = new int [4];
		a[1] = new int [6];
		a[2] = new int [2];
		
		System.out.println("a.length = " + a.length);
		System.out.println("a[0].length = " + a[0].length);
		System.out.println("a[1].length = " + a[1].length);
		System.out.println("a[2].length = " + a[2].length);
		
		for(int i = 0; i < a.length; ++i) {
			for(int j = 0; j < a[i].length; ++j) {
				System.out.println("a[" + i + "][" +j + "] = " + a[i][j]);
			}
//			System.out.println("a[" + i + "][1] = " + a[i][1]);
		}
		
//		System.out.println("a[0] [0] = " + a[0] [0]);
//		System.out.println("a[0] [1] = " + a[0] [1]);
//		
//		System.out.println("a[1] [0] = " + a[1] [0]);
//		System.out.println("a[1] [1] = " + a[1] [1]);
//		
//		System.out.println("a[2] [0] = " + a[2] [0]);
//		System.out.println("a[2] [1] = " + a[2] [1]);
	}
}
