import java.io.*;
public class Exam_11 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		char[] ch = null;
		int[] alpha = new int[26]; //0:a ���� 1:b���� ... 25:z����
		
		System.out.print("��� ���ڸ� �Է¹����ðڽ��ϱ�(�빮�ڸ�)? ");
		num = Integer.parseInt(in.readLine());
		ch = new char[num];
		System.out.print("���� = ");
		
		for(int i = 0; i < ch.length; ++i) {
			ch[i] = (char)System.in.read();
		}
		// A :65 ~ Z :90
		
		for(int i = 0; i<ch.length; ++i) {
			alpha[ch[i] - 65]++;
		}
		
		System.out.println();
		for(int i = 0; i < alpha.length; ++i) {
			System.out.print((char)(i + 65) + "�� ���� = " + alpha[i]);
			if(i % 3 == 2) System.out.println();
			else System.out.println("\t");
		}
	}
}
