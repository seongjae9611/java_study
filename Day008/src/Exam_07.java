
public class Exam_07 {
	public static void main(String[] ar) {
		
		if(ar.length == 0) {
			System.out.println("데이터가 없네요");
			System.out.println("Usage : java Exam_07 매개변수 매개변수 ...");
			System.exit(0);
		}
//		ar = new String[] {"aaa", "bbb", "ccc"};
		System.out.println("ar.length = " + ar.length);
		for(int i = 0; i < ar.length; ++i) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
//		System.out.println("ar[0] = " + ar[0]);
//		System.out.println("ar[1] = " + ar[1]);
//		System.out.println("ar[2] = " + ar[2]);
		
	}
}
