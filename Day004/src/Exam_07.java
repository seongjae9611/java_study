import java.io.*;
public class Exam_07 {
	public static void main(String[] ar) throws IOException {
		byte[] by = new byte[10];
		System.out.print("���� = ");
		System.in.read(by);
		System.out.println("���= " + new String(by));
	}
}
