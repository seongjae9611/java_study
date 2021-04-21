import java.io.*;
public class Exam_08 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int inwon = 0;
		String[] name = null;
		int[] age = null;
		
		System.out.print("인원 = ");
		inwon = Integer.parseInt(in.readLine());
		name = new String[inwon];
		age = new int[inwon];
		
		for(int i = 0; i < inwon; ++i) {
			System.out.print(i + 1 + "번째 사람이름 = ");
			name[i] = in.readLine();
			System.out.print(i + 1 + "번째 사람나이 = ");
			age[i] = Integer.parseInt(in.readLine());
		}
		System.out.println();
		for(int i = 0; i < inwon; ++i) {
			System.out.println(i + 1 +" : " + name[i]+ " : " + age[i]);
		}
	}
}
