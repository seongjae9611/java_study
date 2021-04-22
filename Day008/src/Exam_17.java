import java.io.*;
public class Exam_17 {
	public static void main(String[] ar) throws IOException {
		if(ar.length == 0) {
			System.err.println("Usage : java.Exam_17 과목명 과목명 ... ");
			System.exit(0);
		}
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("총 몇반 = ");
		int x = Integer.parseInt(in.readLine());
		
		String[][] name = new String[x][];
		int[][][] sub = new int[x][][];
		float[][] avg = new float[x][];
		
		for(int i = 0; i < x; ++i) {
			System.out.print(i + "반의 인원수 = ");
			int y = Integer.parseInt(in.readLine());
			name[i] = new String[y];
			sub[i] = new int[y] [ar.length + 3];
			//ar.length : 과목수
			//3 : 총점, 반석차, 전교석차
			avg[i] = new float[y];
		}
		
		
		for (int a = 0; a < name.length; ++a) {
			for (int b = 0; b < name[a].length; ++b) {
				System.out.print(a + "번째 반의" + b + "번째 사람 이름 = ");
				name[a][b] = in.readLine();
		
				for(int i = 0;  i < ar.length; ++i) {
					System.out.print(ar[i] + " = ");
					sub[a][b][i] = Integer.parseInt(in.readLine());
					sub[a][b][ar.length] += sub[a][b][i];
				}
				avg[a][b] = sub[a][b][ar.length] / (float)ar.length;
		
				sub[a][b][ar.length + 1] = 1;
				sub[a][b][ar.length + 2] = 1;
			}
			for(int c = 0; c < name[a].length; ++c) {
				for(int d = 0; d<name[a].length; ++d) {
					if(sub[a][c][ar.length] < sub[a][d][ar.length])
						sub[a][c][ar.length + 1] ++;
				}
			}
		}
		
		for(int a = 0; a < name.length; ++a) {
			for(int b = 0; b < name[a].length; ++b) {
				for(int c = 0; c < name.length; ++c) {
					for(int d = 0; d <name[c].length; ++d) {
						if(sub[a][b][ar.length] < sub[c][d][ar.length])
							sub[a][b][ar.length +2]++;
					}
				}
			}
		}
		
		System.out.println();
		for(int a= 0; a < name.length; ++ a) {
			for(int b = 0; b < name[a].length; ++b) {
				System.out.print(name[a][b] + "\t");
				for(int i = 0; i < sub[a][b].length; ++i) {
					System.out.print(sub[a][b][i] + "\t");
				}
				System.out.printf("%.2f\n", avg[a][b]);
			}
		}
	}
}
		
