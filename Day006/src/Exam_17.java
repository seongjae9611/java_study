import java.io.*;
public class Exam_17 {
	public static void main(String[] ar) throws IOException {
		while(true) {
			System.out.print("문자 = ");
			char ch = (char)System.in.read();
			System.in.read();
			System.in.read();
			System.out.println(ch + " = " + (int)ch);
			
			System.out.print("계속 (y/n) ? " );
			char c = (char)System.in.read();
			System.in.read();
			System.in.read();
			if(c == 'N' || c == 'n') break;
			
		}
	}
}
