import java.io.*;
public class Exam_10 {
	private int inwon;
	private BufferedReader in;
	private String[] name;
	private int[] kor;
	private int[] eng;
	private int[] math;
	private int[] tot;
	private int[] rank;
	private float[] avg;
	
	public Exam_10(String inwon1) {
		inwon = Integer.parseInt(inwon1);
		in = new BufferedReader(new InputStreamReader(System.in));
		name = new String[inwon];
		kor = new int[inwon];
		eng = new int[inwon];
		math = new int[inwon];
		tot = new int[inwon];
		rank = new int[inwon];
		avg = new float[inwon];
	}
	
	public void input() throws IOException {
		for(int i = 0; i < inwon; ++i) {
			System.out.print(i + "번쨰 사람이름 = ");
			name[i] = in.readLine();
			System.out.print("i + 번째 사람국어 = ");
			kor[i] = Integer.parseInt(in.readLine());
			System.out.print("i + 번째 사람영어 = ");
			eng[i] = Integer.parseInt(in.readLine());
			System.out.print("i + 번째 사람수학 = ");
			math[i] = Integer.parseInt(in.readLine());
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3.0f;
			rank[i] = 1;
		}
	}
	
	public void calc_rank() {
		for(int i = 0; i < inwon; ++i) {
			for(int j = 0; j < inwon; ++j) {
				if(tot[i] < tot[j]) rank[i]++;
			}
		}
	}
	
	public void disp() {
		System.out.println();
		for(int i = 0; i < inwon; ++i) {
			System.out.print(name[i] + "\t");
			System.out.print(kor[i] + "\t");
			System.out.print(eng[i] + "\t");
			System.out.print(math[i] + "\t");
			System.out.print(tot[i] + "\t");
			System.out.printf("%.2f\t", avg[i]);
			System.out.println(rank[i]);
		}
	}
	
	public static void main(String[] ar) throws IOException {
		if(ar.length !=1) {
			System.out.println("Usage : java Exam_12 인원수");
			System.exit(0);
		}
		Exam_10 ex = new Exam_10(ar[0]);
		ex.input();
		ex.calc_rank();
		ex.disp();
	}
}
