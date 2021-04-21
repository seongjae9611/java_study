import java.io.*;
public class Exam_05 {
	public static String getString(String str) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str + " = ");
		String s = in.readLine();
		return s;
	}
	public static int getInt(String str) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(str + " = ");
		int s= Integer.parseInt(in.readLine());
		return s;
	}
	
	public static void main(String[] ar) throws IOException {
		String name = getString("이름");
		int age = getInt("나이");
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}
