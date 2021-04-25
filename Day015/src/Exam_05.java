import java.io.*;
public class Exam_05 {
	public static void main(String[] ar) throws Exception {
		if(ar.length <3 ) {
			System.out.println("Usage : java Exam_05 매개1 매개2 매개3");
			System.exit(0);
		}
//		System.out.println("ar[2] = " + ar[2]);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int su1 = 0, su2 = 0, tot = 0;
		System.out.print("su1 = ");
		su1 = Integer.parseInt(in.readLine());
		if(su1 > 100 ) {
			System.out.print("예외 발생 : ");
			Exception ex = new Exception(" > 100");
			throw ex;
		}
		System.out.print("su2 = ");
		if(su2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.exit(0);
		}
		su2 = Integer.parseInt(in.readLine());
		tot = su1 / su2;
		System.out.println("tot = " + tot);
	}
}
