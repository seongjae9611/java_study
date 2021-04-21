import java.io.*;
public class Exam_19 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int su1 = 0, su2 = 0, tot = 0;
		char yon = 0;
		
		System.out.print("Su1 = ");
		su1 = Integer.parseInt(in.readLine());
		
		do {
			System.out.print("yon(+, -, *, /) = ");
			yon = (char)System.in.read();
			System.in.read();
			System.in.read();
		} while (yon != '+' && yon != '-' && yon != '*' && yon != '/');

		do {
			System.out.print("su2 = ");
			su2 = Integer.parseInt(in.readLine());
		} while (yon == '/' && su2 == 0);
		
		switch(yon) {
		case '+' : tot = su1 + su2; break;
		case '-' : tot = su1 - su2; break;
		case '*' : tot = su1 * su2; break;
		case '/' : tot = su1 / su2; break;
		}
		
		System.out.println();
		System.out.println(su1 + " " + yon + " " + su2 + " = " + tot);
	}
}
