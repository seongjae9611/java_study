import java.io.*;
public class Exam_02 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("��� = ");
		int x = Integer.parseInt(in.readLine());
		
		if(x > 0) {
			System.out.println("x = " + x);
			System.out.println("��µǾ����ϴ�.");
		}
	}
}
