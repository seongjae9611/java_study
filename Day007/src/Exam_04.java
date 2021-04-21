import java.io.*;
public class Exam_04 {
	public static int hap(int su1, int su2) {
		return su1 + su2;
	}
	public static int cha(int su1, int su2) {
		return su1 - su2;
	}
	public static int mul(int su1, int su2) {
		return su1 * su2;
	}
	public static int div(int su1, int su2) {
		if (su2 == 0 ) su2 = 1;
		return su1 / su2;
	}
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int su1 = 0, su2 = 0;
		char yon = 0;
		int tot = 0;
		
		System.out.print("su1 = ");
		su1 = Integer.parseInt(in.readLine());
		System.out.print("s2 = ");
		su2 = Integer.parseInt(in.readLine());
		do {
			System.out.print("yon (+,-,*,/) = ");
			yon = (char)System.in.read();
			in.readLine();
		} while (yon != '+' && yon != '-' && yon != '*' && yon != '/');
		
		switch(yon) {
		case '+' : tot = hap(su1, su2); break;
		case '-' : tot = cha(su1, su2); break;
		case '*' : tot = mul(su1, su2); break;
		case '/' : tot = div(su1, su2); break;
		}
		System.out.println(su1 + " " + yon + " " + su2 + " = " + tot);
	}
}
