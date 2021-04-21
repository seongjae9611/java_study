import java.io.*;
public class Exam_18 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int kor = 0, eng = 0, math = 0, tot = 0;
		float avg = 0.0f;
		
		do {
		System.out.print("kor = ");
		kor = Integer.parseInt(in.readLine());
		} while(kor <0 || kor > 100);
		
		do {System.out.print("eng = ");
		eng = Integer.parseInt(in.readLine());
		} while (eng < 0 || eng > 100);
		
		do {System.out.print("math = ");
		math = Integer.parseInt(in.readLine());
		} while (math < 0 || math > 100);
		
		tot = kor  + eng + math;
		avg = tot / 3.0f;
		
		System.out.println("tot = " + tot);
		System.out.println("avg = " + avg);
	}
}
