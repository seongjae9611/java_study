import java.io.*;
public class Exam_06 {
	public static void main(String[] ar) throws IOException {
		int su = 0;
		
		System.out.print("su = ");
		su = System.in.read() - 48;
		
		if (su == 0) {
			System.out.println("����� ���� ����̽ñ���");
		}
		else if (su == 1) {
			System.out.println("����� ���, ��õ ����̽ñ���");
		}
		else if (su == 9) {
			System.out.println("����� ���ֵ� ����̽ñ���");
		}
	}
}
