import java.io.*;
public class Exam_07 {
	public static void main(String[] ar) throws IOException {
//		int su1 = 0;
		char su1 = 0;
		
		System.out.print("su1 = ");
//		su1 = System.in.read() - 48;
		su1 = (char)System.in.read();
		
		switch(su1) {
		case '0' : System.out.println("����� ���� ����̽ñ���"); break;
		case '1' : System.out.println("����� ���, ��õ ����̽ñ���"); break;
		case '9' : System.out.println("����� ���ֵ� ����̽ñ���"); break;
		
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); //else
		}
	}
}

