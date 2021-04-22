import java.io.*;
class Exam_11_Sub {
	private BufferedReader in;
	private String name;
	private int kor, eng, math;
	private int tot;
	private float avg;
	public Exam_11_Sub() {
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	public void input() throws IOException {
		System.out.print("이름 =");
		name = in.readLine();
		System.out.print("국어 = ");
		kor = Integer.parseInt(in.readLine());
		System.out.print("영어 = ");
		eng = Integer.parseInt(in.readLine());
		System.out.print("수학 = ");
		math = Integer.parseInt(in.readLine());
	}
	public void calc() {
		tot = kor + eng + math;
		avg = tot /3.0f;
	}
	public void output() {
		System.out.println("name : " + name);
		System.out.println("tot : " + tot);
		System.out.println("avg : " + avg);
	}
}
public class Exam_11 {
	public static void main(String[] ar) throws IOException {
		Exam_11_Sub ex = new Exam_11_Sub();
		ex.input();
		ex.calc();
		ex.output();
	}
	
}
