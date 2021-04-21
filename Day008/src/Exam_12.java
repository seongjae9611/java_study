import java.io.*;
public class Exam_12 {
	public static void main(String[] ar) throws IOException {
		if(ar.length !=1) {
			System.out.println("Usage : java Exam_11 인원수");
			System.exit(0);
		}
		int inwon = Integer.parseInt(ar[0]);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] name = new String[inwon];
		int[] kor = new int[inwon];
		int[] eng = new int[inwon];
		int[] math = new int[inwon];
		int[] tot = new int[inwon];
		int[] avg = new int[inwon];
		int[] rank = new int[inwon];
		
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
			avg[i] = (int) (tot[i] / 3.0f);
			rank[i] = 1;
		}
		
		for(int i = 0; i < inwon; ++i) {
			for(int j = 0; j < inwon; ++j) {
				if(tot[i] < tot[j]) rank[i]++;
			}
		}
		
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
}
