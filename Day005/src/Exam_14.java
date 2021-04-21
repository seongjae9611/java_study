import java.io.*;
public class Exam_14 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("1. 害失 2.食失 = ");
		int x = Integer.parseInt(in.readLine());
		
		String str = x == 1 ? "害失" : "食失";
		
		System.out.println("str = " + str);
	}
}
