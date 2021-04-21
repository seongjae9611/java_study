import java.io.*;
public class Exam_08 {
	public static void main(String[] ar) throws IOException {
		//변수 선언부
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		String age = "";
		
		//입력 영역
		System.out.print("이름 = ");
		name = in.readLine();
		
		System.out.print("나이 = ");
		age = in.readLine();
		
		//출력 영역
		System.out.println();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
	}
}
