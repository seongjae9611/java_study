import java.io.*;
public class Exam_08 {
	public static void main(String[] ar) throws IOException {
		//���� �����
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		String age = "";
		
		//�Է� ����
		System.out.print("�̸� = ");
		name = in.readLine();
		
		System.out.print("���� = ");
		age = in.readLine();
		
		//��� ����
		System.out.println();
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
	}
}
