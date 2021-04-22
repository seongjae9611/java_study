import java.io.*;
public class Exam_16 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int [][] num = null;
		
		System.out.print("몇행 = ");
		int x = Integer.parseInt(in.readLine());
		num = new int[x][];
		for(int i = 0; i<num.length; ++i) {
			System.out.print(i + "번째 행의 열 = ");
			int y = Integer.parseInt(in.readLine());
			num[i] = new int[y];
		}
		
		for(int i = 0; i< num.length; ++i) {
			for(int j = 0; j <num[i].length; ++j) {
				System.out.print("num [" + i + "][" + j + "] = ");
				num[i][j] = Integer.parseInt(in.readLine());
			}
		}
		
		System.out.println();
		for(int i = 0; i<num.length; ++i) {
			for(int j = 0; j < num[i].length; ++j) {
				System.out.println("num[" + i + "][" + j + "] : " + num[i][j]);
			}
		}
	}
}
