import java.io.*;
public class Exam_08 {
	public static void main(String[] ar) throws IOException {
		int su = 0;
		int year = 0;
		String str = "";
		
		
		System.out.print("�ֹι�ȣ�� 7��° �ڸ� = ");
		su = System.in.read() - 48;
		
		switch(su) {
		case 9 : case 0 : year = 1800; break;
		case 1 : case 2 : year = 1900; break;
		case 3 : case 4 : year = 2000; break;
		default : year = -1;
		}
		
		switch(su % 2) {
		case 0: str = "����"; break;
		case 1: str = "����"; break;
		}
		
		
		if(year == -1) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
		else {
			System.out.println("����� " + year + "��� " + str +"�̽ʴϴ�.");
		}
	}
}
