import java.io.*;
public class Exam_09 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String imsi = "";
		byte a = 0;
		int b = 0;
		float c = 0.0f;
		
		System.out.print("수를 입력 하세요 : ");
		imsi = in.readLine();
		
		a = Byte.parseByte(imsi);
		b = Integer.parseInt(imsi);
		c = Float.parseFloat(imsi);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}
}
