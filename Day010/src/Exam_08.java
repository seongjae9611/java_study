import java.io.*;
class Exam_08_Sub {
	private BufferedReader in;
	private String name;
	private int age;
	public Exam_08_Sub() {
		in = new BufferedReader(new InputStreamReader(System.in));
		name = "";
		age = 0;
	}
	public void setName() throws IOException {
		System.out.print("�̸� = ");
		name = in.readLine();
	}
	public void setAge() throws IOException {
		System.out.print("���� = ");
		age = Integer.parseInt(in.readLine());
	}
	public void disp() {
		System.out.println(name + "��");
		System.out.println("����� " + age + "�� �̽ñ���");
	}
	
}

public class Exam_08 {
	public static void main(String[] ar) throws IOException {
		Exam_08_Sub ex = new Exam_08_Sub();
		ex.setName();
		ex.setAge();
		ex.disp();
	}
}


