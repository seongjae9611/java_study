import java.io.*;
public class Exam_12 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("x = ");
		int x = Integer.parseInt(in.readLine());
		//System.out.println("x = " + x);
		assert x > 5 : "if�� �׽�Ʈ ���� �Ŵ� 5���� ũ�� �־��ּ���"; //�����ڿ��� �߿��� ���� (����ڿ��� �߿����� ����)
		if (x >= 5) {
			System.out.println("5���� ũ�ų� ���� �����Դϴ�.");
		}
		else {
			System.out.println("5���� ���� �����Դϴ�.");
		}
	}
}
