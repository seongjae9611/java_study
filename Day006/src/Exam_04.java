import java.io.*;
public class Exam_04 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int su1 = 0, su2 = 0;
		
		System.out.print("su1 = ");
		su1 = Integer.parseInt(in.readLine());
		System.out.print("su2 = ");
		su2 = Integer.parseInt(in.readLine());
		
		if(su1 > su2) {
			System.out.println("su1 �� su2���� ū ���Դϴ�.");
		}
		else if (su2 > su1) {
			System.out.println("su2�� su1���� ū �� �Դϴ�.");
		}
		else
			System.out.println("su1�� su2�� ���� �� �Դϴ�.");
	}
}
