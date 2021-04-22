import java.io.*;
public class Exam_04 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int[] x = null;
		
		System.out.print("num = ");
		num = Integer.parseInt(in.readLine());
		x = new int[num];
		
		for(int i = 0; i < x.length; ++i) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		int sdd;
	}
}
