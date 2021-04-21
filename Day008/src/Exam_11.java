import java.io.*;
public class Exam_11 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		char[] ch = null;
		int[] alpha = new int[26]; //0:a 개수 1:b개수 ... 25:z개수
		
		System.out.print("몇개의 문자를 입력받으시겠습니까(대문자만)? ");
		num = Integer.parseInt(in.readLine());
		ch = new char[num];
		System.out.print("문자 = ");
		
		for(int i = 0; i < ch.length; ++i) {
			ch[i] = (char)System.in.read();
		}
		// A :65 ~ Z :90
		
		for(int i = 0; i<ch.length; ++i) {
			alpha[ch[i] - 65]++;
		}
		
		System.out.println();
		for(int i = 0; i < alpha.length; ++i) {
			System.out.print((char)(i + 65) + "의 개수 = " + alpha[i]);
			if(i % 3 == 2) System.out.println();
			else System.out.println("\t");
		}
	}
}
